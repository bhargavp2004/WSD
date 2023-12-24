import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class RGC {
    public RGC() {}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            IRandomGenerator irg = (IRandomGenerator) registry.lookup("GenerateRandom");
            int number = Integer.parseInt(args[0]);
            System.out.println("Number : " + number);
            ArrayList<Integer> list = irg.GenerateRandom(number);

            for (Integer i : list) {
                System.out.println("i : " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
