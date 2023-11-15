package Ejercicio2_5;
import java.util.Random;
import java.util.Scanner;
//Leer un número n y definir un array de la longitud n y llenar con
// números aleatorios del 1 al 10. Luego que calcule el maximo.
public class Ejercicio7 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
         Random random = new Random();
        int x, num, big=0;
        System.out.println("Dame un numero: ");
        x = scan.nextInt();
        int [] palabra = new int[x];
       
        
        for (int i=0; i < x; i++){
            num = random.nextInt(10) + 1;
           // num = (int) Math.floor(Math.random()*10+1);
            palabra[i] = num;
            System.out.println(num);
            if (num > big) {
                  big = num;
            }
          
        }
        System.out.println("El numero mas grande es "+ big);
    }

}
