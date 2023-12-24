import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Student extends UnicastRemoteObject implements IStudent {
    private List<StudentInfo> students;

    public Student() throws RemoteException {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, String branch) {
        students.add(new StudentInfo(id, name, branch));
    }

    @Override
    public List<StudentInfo> getStudentsList() throws RemoteException {
        return students;
    }
}
