import java.io.*;
import java.net.*;
public class selectiveRepeatClient {

	static Socket connection;
	public static void main(String[] args)throws Exception, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number between 1 to 9 to lose that frame for demonstarting selective Repeat protocol:");
		int k=Integer.parseInt(buf.readLine());
		
          try {
        	
        	  int v[]=new int[9];
        	  
        	  int n=0;
        	  InetAddress address=InetAddress.getByName("Localhost");
        	  System.out.println(address);
        	  
        	  connection=new Socket(address,8000);
        	  
        	  DataOutputStream DataoutSt=new DataOutputStream(connection.getOutputStream());
        	  DataInputStream DatainSt=new DataInputStream(connection.getInputStream());
        	  
        	  int p=DatainSt.read();        	  
        	  System.out.println("Frame number:"+p);
        	  
        	  for(int i=0;i<p;i++) {
        		  v[i]=DatainSt.read();
        		  
        		  System.out.println(v[i]);
        	  }       	  
        	  
        	v[k]=-1;  
        	for(int i=0;i<p;i++) {
        		
        		System.out.println("Receieved frame:"+v[i]);
        	}
        	
        	for(int i=0;i<p;i++) {
                if(v[i]==-1) {
        			
        			System.out.println("Request to retransmit packet number:"+(i+1)+" again");
        		    n=i;
        			DataoutSt.write(n);
        		    DataoutSt.flush();
        		    
        		}
        	}
        	
           System.out.println();        	
        	v[n]=DatainSt.read();
        	System.out.println("Received frame is:"+v[n]);
        	System.out.println("quiting..");
          }
          
          catch(Exception e) {
        	  e.getMessage();
          }
	}

}
