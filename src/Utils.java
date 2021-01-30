import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

public class Utils {
    public static String getComputerName() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        return address.getHostName();
    }

    public static String getIpAddress() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        return address.getHostAddress();
    }
}
