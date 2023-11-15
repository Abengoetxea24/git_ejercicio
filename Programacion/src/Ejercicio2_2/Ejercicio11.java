package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        String Letra;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe una letra: ");
        Letra = scan.nextLine();
         scan.close();
            if (Letra.equalsIgnoreCase ("S")) {
            System.out.println("SI");
        }else {
            if (Letra.equalsIgnoreCase ("N")) {
                System.out.println("NO");
            } else {
                System.out.println("ERROR");
            }}
        } 
        

       
    }

