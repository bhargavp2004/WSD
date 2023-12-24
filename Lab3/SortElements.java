import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;

public class SortElements extends UnicastRemoteObject implements ISort{

    public SortElements () throws RemoteException {};

    public ArrayList<Integer> sortIntegers(ArrayList<Integer> values)
    {
        Collections.sort(values);
        return values;
    }
}
