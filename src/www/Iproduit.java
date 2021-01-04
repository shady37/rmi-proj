package www;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Iproduit extends Remote {
	 public  void  ProduitMatriciel(int[][]A,int[][] B,int [][]C ,int minl ,int maxl,int mincol ,int maxcol,int n) throws RemoteException;

	 }