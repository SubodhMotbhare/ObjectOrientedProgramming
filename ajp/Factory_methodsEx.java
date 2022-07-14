import java.net.*;
class Factory_methodsEx
{
public static void main(String s[]) throws UnknownHostException
{
int i;
InetAddress id=InetAddress.getLocalHost();
System.out.println("Local host address= "+id);
InetAddress id2=InetAddress.getByName("msbte.org.in");
System.out.println(id2);
}
}