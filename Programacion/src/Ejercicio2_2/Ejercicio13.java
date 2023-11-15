package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("Nota: ");
        nota = scan.nextDouble();
         if (nota >= 0 & nota <= 4.9) {
            System.out.println("suspenso");
        }else {
           if (nota >= 5 & nota <= 5.9) {
            System.out.println("suficiente");
        } else {
            if (nota >= 6 & nota <= 6.9) {
                 System.out.println("Bien");

        } else {
           if (nota >= 7 & nota <= 8.9) {
            System.out.println("Muy Bien");
        } else {
           if (nota >= 9 & nota <= 10) {
            System.out.println("Sobresaliente");
           }else{
                System.out.println("ERROR");
            }}}
        } 
        

       
    }
}}