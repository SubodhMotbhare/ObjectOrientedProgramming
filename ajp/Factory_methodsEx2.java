import java.net.*;
class Factory_methodsEx2
{
public static void main(String s[]) throws UnknownHostException
{
InetAddress addr1=InetAddress.getLocalHost();
System.out.println(addr1);
InetAddress addr2=InetAddress.getByName("msbte.org.in");
System.out.println(addr2);
InetAddress addr4=InetAddress.getByAddress("192.168.43.210");
System.out.println(addr4);
int i;
InetAddress addr3[]=InetAddress.getAllByName("www.google.com");
for( i=0; i<addr3.length; i++);
{
System.out.println(addr3[i]);
}
}
}