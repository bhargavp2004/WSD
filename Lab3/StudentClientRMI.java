import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class StudentClientRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            IStudent studentService = (IStudent) registry.lookup("StudentService");
            List<StudentInfo> students = studentService.getStudentsList();

            for (StudentInfo student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
