import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface IRandomGenerator extends Remote{
    public ArrayList<Integer> GenerateRandom(int n) throws RemoteException;
}