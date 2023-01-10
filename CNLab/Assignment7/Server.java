import java.io.*;
import java.net.*;
public class Server 
{
public static void main(String[] args) throws Exception 
{
System.out.print("hello ");
DatagramSocket s=new DatagramSocket(65534);
InetAddress ia=InetAddress.getLocalHost();
byte[]filename=new byte[1000];
byte[]b=new byte[10000000];


//receiving name
DatagramPacket name=new DatagramPacket(filename,filename.length);
s.receive(name);
System.out.print("hello");
System.out.println(new String(name.getData()));


DatagramPacket p=new DatagramPacket(b,b.length);
s.receive(p);
System.out.print("hello");
System.out.println(new String(p.getData()));

String fname=new String(name.getData()).trim();
fname="C:\\Users\\hp\\Desktop\\"+fname;
System.out.println(fname);

String filedata=new String(p.getData()).trim();
System.out.println(filedata);


PrintWriter pw = new PrintWriter(fname);
pw.println(filedata);
pw.close();
}

}