import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IMedian extends Remote {
    public double findMedian(ArrayList<Integer> values) throws RemoteException;
}
