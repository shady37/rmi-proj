package www;

import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;

public class PImp extends UnicastRemoteObject implements mat {
	
    private static Scanner scanner = new Scanner(System.in);

	       public PImp() throws RemoteException
	       {
		    super();
	       }
	    		 public static void  ProduitMatriciel() throws RemoteException
	    			   
	    			    {

	    			 int lignes = 0;
	    		        int colonnes = 0;

	    		        // Saisie de la 1�re matrice
	    		       System.out.println("Saisie de la 1ere matrice :");

	    		        // On v�rifie que le nombre de lignes est plus grand 
	    		        // que 0
	    		        do {
	    		           System.out.print("  Nombre de lignes : ");
	    		            lignes = scanner.nextInt();
	    		        } while (lignes < 1);

	    		        // On v�rifie que le nombre de colonnes est plus grand 
	    		        // que 0
	    		        do {
	    		           System.out.print("  Nombre de colonnes : ");
	    		            colonnes = scanner.nextInt();
	    		        } while (colonnes < 1);

	    		        // D�claration-construction de la 1�re matrice
	    		        double[][] mat1 = new double[lignes][colonnes];
	    		        for (int row = 0; row < lignes; row++) {
	    		            for (int col = 0; col < colonnes; col++) {
	    		               System.out.print("  M[" + (row + 1) + "," 
	    		                         + (col + 1) + "]=");
	    		                mat1[row][col] = scanner.nextDouble();
	    		            }
	    		        }


	    		        // ... et on refait la m�me chose pour la 2�me matrice
	    		       System.out.println("Saisie de la 2eme matrice :");
	    		        do {
	    		           System.out.print("  Nombre de lignes : ");
	    		            lignes = scanner.nextInt();
	    		        } while (lignes < 1);

	    		        do {
	    		           System.out.print("  Nombre de colonnes : ");
	    		            colonnes = scanner.nextInt();
	    		        } while (colonnes < 1);

	    		        double[][] mat2 = new double[lignes][colonnes];
	    		        for (int row = 0; row < lignes; row++) {
	    		            for (int col = 0; col < colonnes; col++) {
	    		               System.out.print("  M[" + (row + 1) + "," 
	    		                         + (col + 1) + "]=");
	    		                mat2[row][col] = scanner.nextDouble();
	    		            }
	    		        }

	    		        // Ici on multiplie les matrices
	    		        if (mat1[0].length != mat2.length) {
	    		           System.out.println("Multiplication de matrices " +
	    		                       "impossible !");
	    		        } else {
	    		            // D�claration-construction de la matrice r�sultat
	    		            double[][] prod = 
	    		              new double[mat1.length][mat2[0].length];
	    		            for (int row = 0; row < mat1.length; row++) {
	    		                for (int col = 0; col < mat2[0].length; col++) {
	    		                    prod[row][col] = 0.0;
	    		                    for (int i = 0; i < mat2.length; i++) {
	    		                        prod[row][col] += mat1[row][i] * 
	    		                          mat2[i][col];
	    		                    }
	    		                }
	    		            }

	    		            // Affichage du r�sultat
	    		           System.out.println("R�sultat :");
	    		            for (int row = 0; row < prod.length; row++) {
	    		                for (int col = 0; col < prod[row].length; col++) {
	    		                   System.out.print(prod[row][col] + " ");
	    		                }
	    		               System.out.println();
	    		            }
	    		        }
	    			    }
}

	 



