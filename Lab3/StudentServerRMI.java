import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class StudentServerRMI {
    public static void main(String[] args) {
        try {
            Student studentService = new Student();
            studentService.addStudent(1, "Bhargav", "Computer Engineering");
            studentService.addStudent(2, "Rahul", "Computer Engineering");
            studentService.addStudent(3, "Akshar", "Computer Engineering");

            try {
                UnicastRemoteObject.unexportObject(studentService, true);
                System.out.println("Object unexported.");
            } catch (Exception e) {
                System.out.println("Object unexport process failed");
            }

            IStudent studentStub = (IStudent) UnicastRemoteObject.exportObject(studentService, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            
            registry.rebind("StudentService", studentStub);

            System.out.println("Server ready!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
