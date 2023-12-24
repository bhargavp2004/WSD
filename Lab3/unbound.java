import java.rmi.*;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class unbound {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            registry.unbind("GetStudentsList");
            System.out.println("Object unbound from the registry.");
        } catch (Exception ex) {
            // Object was not previously bound, ignore
        }
    }

}
