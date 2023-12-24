import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class EX3Client {
    public EX3Client(){};

    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            IRandomGenerator irg = (IRandomGenerator) registry.lookup("GenerateRandom");
            int number = Integer.parseInt(args[0]);
            System.out.println("Number : " + number);
            ArrayList<Integer> list = irg.GenerateRandom(number);

            System.out.println("Randomly Generated Elements :");
            for (Integer i : list) {
                System.out.print(i + " ");
            }

            ISort is = (ISort) registry.lookup("SortElements");
            ArrayList<Integer> elements = is.sortIntegers(list);

            System.out.println("Elements after sorting : ");           
            for(Integer i : elements)
            {
                System.out.print(i + " ");
            }

            IMedian im = (IMedian) registry.lookup("FindMedian");
            double median = im.findMedian(elements);
            
            System.out.println("Median : " + median);
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        
    }
}
