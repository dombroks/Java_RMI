import InterfaceImplementation.FirstServerServicesImpl;

import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server1 {
    public static void main(String[] args) throws RemoteException, UnknownHostException {
        System.out.println("I'm the server 1...");
        System.out.println("PC: " + Utils.getComputerName());
        System.out.println("@ip: " + Utils.getIpAddress());
        Registry registry = LocateRegistry.createRegistry(1099);
        FirstServerServicesImpl firstServerServicesImp = new FirstServerServicesImpl();
        try {
            registry.bind("object1", firstServerServicesImp);
        } catch (AlreadyBoundException e) {
            registry.rebind("object1", firstServerServicesImp);
        }
    }
}
