package Ejercicio2_5;
//5 luzerako arraia definitu eta izenekin bete. Gero, a-z hasten diren izenak pantailatik atera.
import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        String [] arrai = new String[5];

        for (int i = 0; i<5; i++){
            System.out.println("Dame un nombre ");
            arrai[i]= scan.nextLine();
            
               
        }
      /*   for (int i = 0; i<5; i++){
        if(arrai[i].charAt(0) == "a"){
            System.out.println(arrai[i]);

        }*/

        for (int i = 0; i<5; i++){
        if(arrai[i].substring(0,1).equals("a")){
            System.out.println(arrai[i]);

        }
        
    }
 /*  
        for (int i = 0; i<5; i++){
        if(arrai[i].contains("a")){
            System.out.println(arrai[i]);

        }
    }
 */ 

}}
