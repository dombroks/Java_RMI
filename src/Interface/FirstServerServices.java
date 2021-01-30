package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FirstServerServices extends Remote {
    int fib(int n) throws RemoteException;
}
