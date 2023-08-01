package wrapper_class;
import java.net.InetAddress;
public class ip_address {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InetAddress IP = InetAddress.getLocalHost();
		System.out.println("IP: "+IP.getHostAddress());
	}

}
