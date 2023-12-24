import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISum extends Remote
{
	public int sum(int a, int b) throws RemoteException;
}

