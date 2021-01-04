package www;

import java.rmi.*;
import java.rmi.server.*;
 

public class FabImp extends UnicastRemoteObject implements FabInt {
   public FabImp ()throws RemoteException {};
   public mat newMatrice() throws RemoteException {
     return new PImp();}
}


