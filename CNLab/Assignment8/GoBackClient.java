import java.io.*;
import java.net.*;
import java.util.*;

public class GoBackClient {

public static void main(String args[]) throws IOException
{
     Socket s;
     int ack = 0;
     Random R = new Random();
     Scanner sc = new Scanner(System.in);

     try{
          s = new Socket("127.0.0.1", 9876);
              DataOutputStream out = new DataOutputStream(s.getOutputStream());
              DataInputStream in = new DataInputStream(s.getInputStream());
              int p = in.read();
              System.out.print("\nEnter window size: ");
              int n = sc.nextInt();
              out.write(n);
              out.flush();
              boolean loop = true;
              System.out.println("Frames Received: ");

              int got = 0;
              int r = R.nextInt(p-1);; //packet to be lost
               while(loop) 
                { 
                    for(int i=0; i<n; i++) {
                        ack = in.read();
                             if(ack == r) 
                             {
                                System.out.println("Lost "+r);
                                ack = r-1;
                                    for(int j=(r+1)%n; j<n; j++)
                                      System.out.println("\nDiscarded "+in.read());
                                    r=-1;
                                    i=n;
                            }
                        else 
                           {
                             System.out.print(ack + " | ");
                             got++;
                             if(got == p) 
                             {
                             System.out.println("\nReceived all "+got+"frames");
                              loop = false;
                              break;
                             }
                           }
                    }//close for
                      out.write(ack+1);
                      System.out.println("\nAck send "+(ack+1));
                   }//close while
               }
               
               catch(Exception e) {
                 e.printStackTrace();
               }

}
}
