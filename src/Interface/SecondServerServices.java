package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SecondServerServices extends Remote {
    int square(int n) throws RemoteException;
}
