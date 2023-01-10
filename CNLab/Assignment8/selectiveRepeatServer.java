import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.SocketException;

public class selectiveRepeatServer  {

	static ServerSocket ssocket;
	static DataInputStream dataInSt;
	static DataOutputStream dataOpSt;
	
	
	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub

      try {
    	  int a[]= {20,40,50,10,70,80,200,100,110};
    	  
    	  ssocket=new ServerSocket(8000);
    	  System.out.println("waiting for connection");
    	  
    	  Socket client=ssocket.accept();
    	  
    	  dataInSt=new DataInputStream(client.getInputStream());
    	  dataOpSt=new DataOutputStream(client.getOutputStream());
		
    	  System.out.println("The number of packets sent is"+a.length);
    	
    	  dataOpSt.write(a.length);
    	  dataOpSt.flush();
    	  
    	
    	for(int i=0;i<a.length;i++) {
    		
    		dataOpSt.write(a[i]);
    		dataOpSt.flush();
    	}
    	
    	  int k=dataInSt.read();
    	  dataOpSt.write(a[k]);
    	  dataOpSt.flush();
    	  
    	  
      }
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
		  try {
			dataInSt.close();
			dataOpSt.close();
		  }
		   catch(IOException e) {
			   e.printStackTrace();
		   }
		}
		
	}

}
