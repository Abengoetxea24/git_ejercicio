package Ejercicio2_5;
//5 luzerako arraia definitu, eta teklatutik sartutako hitzekin bete.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String [] args) {
        Scanner scan= new Scanner(System.in);
        String [] arrai= new String [5];

        for (int i = 0; i <5; i++ ){
            System.out.println("introduce la palabra: ");
            arrai [i] = scan.nextLine();
           
        }
 //        for (int i = 0; i <5; i++ ){
   //      System.out.println(arrai[i]);
   // }
}
}
