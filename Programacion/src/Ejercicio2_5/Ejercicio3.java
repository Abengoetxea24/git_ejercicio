package Ejercicio2_5;
import java.util.Random;
/*
 n zenbaki bat irakurri eta arrai bat definitu, n
  luzerakoa eta 1etik 10era dauden ausaz sortutako zenbakiekin bete.
 */
import java.util.Scanner;
public class Ejercicio3 {

    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        Random random = new Random();
        System.out.println("De cuanto sera el arrai? ");
        int x=scan.nextInt();
        int [] arrai = new int[x];

        for (int i = 0; i < x; i++) {
            int y = random.nextInt(10) + 1;
            System.out.println(arrai[i]= y);
        }
        

    }

    
}
