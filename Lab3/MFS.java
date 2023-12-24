import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MFS {
    public MFS(){};

    public static void main(String[] args) {
        try{
            Median obj = new Median();
            System.out.println("Object unexported!");
            IMedian stub = (IMedian) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("FindMedian", stub);
            System.out.println("Median Server Ready!");
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
