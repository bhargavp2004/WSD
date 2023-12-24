import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ISort extends Remote {
    public ArrayList<Integer> sortIntegers(ArrayList<Integer> values) throws RemoteException;
}
