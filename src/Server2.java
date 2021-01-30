import InterfaceImplementation.SecondServerImpl;

import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server2 {

    public static void main(String[] args) throws RemoteException, UnknownHostException {
        System.out.println("I'm the server 2...");
        System.out.println("PC: " + Utils.getComputerName());
        System.out.println("@ip: " + Utils.getIpAddress());
        Registry registry = LocateRegistry.createRegistry(1098);
        SecondServerImpl secondServerImp = new SecondServerImpl();
        try {
            registry.bind("object2", secondServerImp);
        } catch (AlreadyBoundException e) {
            registry.rebind("object2", secondServerImp);
        }
    }
}
