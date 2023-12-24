import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator extends UnicastRemoteObject implements IRandomGenerator {
    private ArrayList<Integer> randomNumbers = new ArrayList<>();
    private Random random = new Random();

    public RandomGenerator() throws RemoteException {
    }

    public ArrayList<Integer> GenerateRandom(int n) {
        int max = 100, min = 1;
        randomNumbers.clear(); 

        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            Integer randomInteger = Integer.valueOf(randomNumber);
            randomNumbers.add(randomInteger);
        }

        return randomNumbers;
    }
}

