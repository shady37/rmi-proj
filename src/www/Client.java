package www;

import java.rmi.registry.*;
import java.util.Scanner;
public class Client {
    public Client(String[] args) {

        try {

            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            Ifactory fabrique = (Ifactory) reg.lookup("Fabrique");
            Iproduit Obj1;
            Obj1 = (Iproduit) fabrique.newMatrice();

            Iproduit Obj2;
            Obj2 = (Iproduit) fabrique.newMatrice();


            Iproduit Obj3;
            Obj3 = (Iproduit) fabrique.newMatrice();

            Iproduit Obj4;
            Obj4 = (Iproduit) fabrique.newMatrice();


            System.out.print("Saisir le nombre de lignes dans la matrice a: ");
            Scanner sc = new Scanner(System.in);
            int m1 = sc.nextInt();

            System.out.print("Saisir le nombre de colonnes dans la matrice a: ");
            int n1 = sc.nextInt();
            //déclarer la matrice
            int[][] a = new int[m1][n1];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(String.format("Entrez a[%d][%d] : ", i, j));
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.print("Saisir le nombre de lignes dans la matrice b: ");
            int m2 = sc.nextInt();

            System.out.print("Saisir le nombre de colonnes dans la matrice b: ");
            int n2 = sc.nextInt();
            //déclarer la matrice
            int[][] b = new int[m1][n1];
            for (int i1 = 0; i1 < m1; i1++) {
                for (int j1 = 0; j1 < n1; j1++) {
                    System.out.print(String.format("Entrez b[%d][%d] : ", i1, j1));
                    b[i1][j1] = sc.nextInt();
                }
            }
            int [][] r1=new int[m1/2][n2/2];
            int [][] r2=new int[m1/2][n2/2];
            int [][] r3=new int[m1/2][n2/2];
            int [][] r4=new int[m1/2][n2/2];
            Obj1.ProduitMatriciel(a,b,r1,0,m1/2,0,n1/2,n1/2);
            Obj2.ProduitMatriciel(a,b,r2,0,m1/2,n1/2,n1,n1/2);
            Obj3.ProduitMatriciel(a,b,r3,m1/2,m1,0,n1/2,n1/2);
            Obj4.ProduitMatriciel(a,b,r4,m1/2,m1,n1/2,n1,n1/2);

        }
        catch (Exception e) {
            System.out.println("Erreur d'acces a l'objet distant.");
            System.out.println(e.toString());
        }




    }
}











