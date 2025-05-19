import java.net.*;


public class Inet {
    public static void main(String[] args) throws UnknownHostException{
        
        {
            InetAddress ob1 = InetAddress.getByName("www.google.com");
            System.out.println(ob1.getHostName());
        }
    }
}
