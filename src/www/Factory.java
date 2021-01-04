package www;

import java.rmi.*;
import java.rmi.server.*;
 

public class Factory extends UnicastRemoteObject implements Ifactory {
   public Factory()throws RemoteException {};
   public Iproduit newMatrice() throws RemoteException {
     return new Produit();}
}


