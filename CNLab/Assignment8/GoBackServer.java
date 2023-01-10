import java.io.*;
import java.net.*;
import java.util.*;

public class GoBackServer {
          public static void main(String []args) {
         
            int n;
            int a[];
            ServerSocket ss = null;
            DataInputStream in = null;
            DataOutputStream out = null;
            Scanner sc = new Scanner(System.in);
             try {
                   ss = new ServerSocket(9876);
                   System.out.println("Waiting for Client...");
                   Socket client = ss.accept();
                   System.out.println("Connection established.");
                    
                    in = new DataInputStream(c.getInputStream());
                    out = new DataOutputStream(c.getOutputStream());

                    System.out.print("Enter no. of packets to send: ");
                    int p = sc.nextInt(); 
                    out.write(p);
                    out.flush();

                    n = in.read();
                    System.out.print("Window size: "+n);
                    boolean loop = true;
                    int sent = 0;
                    
                    System.out.println("\nSending frames...");
                    while(loop) 
                    {
                        for(int i=0; i<n; i++) {
                            out.write(sent);
                            sent++;
                         if(sent == p)
                           break;
                        }
                    int ack = in.read();
                    System.out.println("Ack received: "+ack);
                     if(ack >= p)
                     break;
                     sent = ack;
 
                      System.out.println("Retransmitting from " + sent + "...");

                    }//close while
                    
                    System.out.println("Transmitted all!");

                    }//close try
                     catch(Exception e) {
                        e.printStackTrace();
                    }
                    finally { 
                        try {
                            out.close();
                            in.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                }
                                }
}
}
