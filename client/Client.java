import java.rmi.*;
import java.io.*;
public class Client
{

public static void main(String args[])throws Exception
{

sampleserver remoteobject =(sampleserver)Naming.lookup("rmi://10.2.3.100:4000/SERVER");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println(remoteobject.add(34,4));  
}
}