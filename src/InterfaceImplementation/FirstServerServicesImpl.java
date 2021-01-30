package InterfaceImplementation;

import Interface.FirstServerServices;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FirstServerServicesImpl extends UnicastRemoteObject implements FirstServerServices {
    public FirstServerServicesImpl() throws RemoteException {
        super();
    }

    public int fib(int n) throws RemoteException {
        int result = fibHelper(n);
        System.out.println("Server1: " + n + " -> " + result);
        return result;
    }
    private int fibHelper(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibHelper(n - 2) + fibHelper(n - 1);
    }
}
