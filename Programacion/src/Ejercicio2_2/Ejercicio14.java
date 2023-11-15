package Ejercicio2_2;

import java.util.Scanner;
//14. Pedir tres números y decir si ha introducido en orden ascendiente o no.

public class Ejercicio14 {

    public static void main(String[] args) {
       int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextInt();
         System.out.println("Escribe otro numero: ");
        num2 = scan.nextInt();
         System.out.println("Escribe otro numero: ");
        num3 = scan.nextInt();
        scan.close();
            if (num1 < num2 & num2 < num3) {
            System.out.println("SI, es ascendente");
        }else {
                System.out.println("NO, no es ascendente");
            }}
        } 
        

       
    
