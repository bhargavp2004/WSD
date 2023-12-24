import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SES {
    public SES(){};

    public static void main(String[] args) {
        try{
            SortElements obj = new SortElements();
            UnicastRemoteObject.unexportObject(obj, true);   //unexport if already it is exported
            ISort stub = (ISort) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("SortElements", stub);
            System.out.println("Sort Elements Server Ready!");
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
