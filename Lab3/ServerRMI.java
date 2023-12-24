import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 

public class ServerRMI  { 
   public ServerRMI() {} 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         Sum obj = new Sum(); 
    
         // Exporting the object of implementation class
		 // to Java RMI runtime to receive remote incoming calls.  
		 // Export it as a server stub (hostname, port).
		 // If you pass a zero to the method, the default 
		 // TCP port number 1099 is used for RMI.
         ISum stub = (ISum) UnicastRemoteObject.exportObject(obj, 0);  
         
         // Binding the remote object (stub) in the registry 
         Registry registry = LocateRegistry.getRegistry(); 
         
         registry.rebind("Sum", stub);  
         System.out.println("Server ready!"); 
      } catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
} 