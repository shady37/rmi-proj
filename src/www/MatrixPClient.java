package www;

import java.rmi.registry.*;
import java.util.Scanner;

public class MatrixPClient {
    public MatrixPClient(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            FabInt fabrique = (FabInt) reg.lookup("Fabrique");

            mat Obj1;
            Obj1 = (mat) fabrique.newMatrice();
            mat.ProduitMatriciel();

            mat Obj2;
            Obj2 = (mat) fabrique.newMatrice();
            mat.ProduitMatriciel();

            mat Obj3;
            Obj3 = (mat) fabrique.newMatrice();
            mat.ProduitMatriciel();

            mat Obj4;
            Obj4 = (mat) fabrique.newMatrice();
            mat.ProduitMatriciel();
  



        } catch (Exception e) {
            System.out.println("Erreur d'acces a l'objet distant.");
            System.out.println(e.toString());
        }

       
}
}

