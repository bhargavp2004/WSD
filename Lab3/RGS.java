import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RGS {
    public RGS() {
    };

    public static void main(String[] args) {

        try {

        } catch (Exception e) {
            System.out.println("Object unexport process failed");
        }

        try {
            RandomGenerator obj = new RandomGenerator();
            UnicastRemoteObject.unexportObject(obj, true);
            System.out.println("Object unexported.");
            IRandomGenerator stub = (IRandomGenerator) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("GenerateRandom", stub);
            System.out.println("Random Generator Server ready!");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
