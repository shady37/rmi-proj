package www;

import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;

public class Produit extends UnicastRemoteObject implements Iproduit {
	


	       public Produit() throws RemoteException
	       {
		    super();
	       }

	       public void Affiche(int[][] m ,int l ,int c){
	       		for(int i=0;i<l;i++){
	       			for(int j=0;j<c;j++){
	       				System.out.print(m[i][j]);
	       			}
	       			System.out.println();
	       		}
	       }



	@Override
	public void ProduitMatriciel(int[][] A, int[][] B, int[][] C, int minl, int maxl, int mincol, int maxcol, int n) throws RemoteException {
			//multiplication
					for(int i=minl; i<maxl; i++){
						for(int j=mincol; j<maxcol; j++){
							C[i][j] = 0;
							for(int k=minl; k<=n ;k++)
							{
								C[i][j] += A[i][k] * B[k][j];
							}
							System.out.print(C[i][j]+" ");
						}
						System.out.println();
					}
				}
	}




	 



