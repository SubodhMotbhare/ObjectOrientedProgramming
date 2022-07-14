import java.net.*;

public class Instance_methodsEx
{
public static void main(String s[]) throws Exception
{
InetAddress addr1=InetAddress.getByName("www.javatpoint.com");
InetAddress addr2=InetAddress.getByName("www.yahoo.com");
InetAddress addr3=InetAddress.getByName("www.javatpoint.com");
System.out.println("\n Is "+ addr1+"equals" +addr2+"="+addr1.equals(addr2));
System.out.println("\n Is "+ addr1+"equals" +addr3+"="+addr1.equals(addr3));
System.out.println("\n getHost address of addr1 =" +addr1.getHostAddress());
System.out.println("\n getHost name of addr1 =" +addr1.getHostName());
System.out.println("\n Is address2 Multicast Address =" +addr2.isMulticastAddress());
System.out.println("\n Convert into string =" +addr2.toString());
}
}
