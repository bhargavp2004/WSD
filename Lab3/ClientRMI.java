import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class ClientRMI {  
   private ClientRMI() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry("localhost"); 
    
         // Looking up the registry for the remote object 
         ISum stub = (ISum) registry.lookup("Sum"); 
    
         // Calling the remote method using the obtained object 
         System.out.println(stub.sum(Integer.parseInt(args[0]), 
									 Integer.parseInt(args[1]))); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}