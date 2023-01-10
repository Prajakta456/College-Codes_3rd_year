import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client 
{
public static void main(String[] args) throws Exception 
  {
      Scanner sc=new Scanner(System.in);
      DatagramSocket s=new DatagramSocket();
      InetAddress ia=InetAddress.getLocalHost();
      File file=new File("C:\\Users\\hp\\Desktop\\New Folder\\hello.txt");

      FileReader fileReader=new FileReader(file);
      BufferedReader br=new BufferedReader(fileReader);
      StringBuilder sb1=new StringBuilder();

      String line;
      while((line=br.readLine())!=null) 
      {
	sb1.append(line);
	sb1.append("\n");
      }
     System.out.println(sb1.toString());

     byte[] sentname=file.getName().getBytes();
     DatagramPacket p1=new DatagramPacket(sentname,sentname.length,ia,65534);
     s.send(p1);

     byte[] senttoserver=sb1.toString().getBytes();
     DatagramPacket p2=new DatagramPacket(senttoserver,senttoserver.length,ia,65534);
     s.send(p2);
     s.close();
   }

}