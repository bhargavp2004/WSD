import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IStudent extends Remote {
    List<StudentInfo> getStudentsList() throws RemoteException;
}
