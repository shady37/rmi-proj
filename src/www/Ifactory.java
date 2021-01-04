package www;

import java.rmi.*;
public interface Ifactory extends Remote{

	   public Iproduit newMatrice() throws RemoteException ;
}



