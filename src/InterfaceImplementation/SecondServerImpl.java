package InterfaceImplementation;

import Interface.SecondServerServices;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SecondServerImpl extends UnicastRemoteObject implements SecondServerServices {
    public SecondServerImpl() throws RemoteException {
        super();
    }

    @Override
    public int square(int n) throws RemoteException {
        int result = (int) Math.pow(n, 2);
        System.out.println("Server2: " + n + " -> " + result);
        return result;
    }
}
