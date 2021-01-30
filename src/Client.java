import Interface.FirstServerServices;
import Interface.SecondServerServices;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws RemoteException, NotBoundException, InterruptedException {
        System.out.println("I'm the client");
        System.out.println("Please type the N value...");
        int n = scanner.nextInt();
        Registry registry = LocateRegistry.getRegistry(args[0], 1099);
        Registry registry2 = LocateRegistry.getRegistry(args[1], 1098);

        FirstServerServices firstServerServices = (FirstServerServices) registry.lookup("object1");
        SecondServerServices secondServerServices = (SecondServerServices) registry2.lookup("object2");

        for (int i = 0; i < n; i++) {
            System.out.print("Client, I'm receiving : " + i + " : ");
            System.out.print(firstServerServices.fib(i) + "<- Server1");
            System.out.print("        ");
            System.out.print(secondServerServices.square(i) + "<- Server2");
            System.out.println("");
            Thread.sleep(1000L);
        }


    }
}
