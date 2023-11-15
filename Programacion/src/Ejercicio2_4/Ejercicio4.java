package Ejercicio2_4;

import java.util.Scanner;

//Decir si una palabra es palíndroma o no.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra, invertida = "";
        System.out.println("Escriba la palabra: ");
        palabra = scan.nextLine();

        for (int posicion=palabra.length()-1; posicion >= 0; posicion--  ) {
           invertida +=  palabra.charAt(posicion);
          
    }
     System.out.println(palabra.equals(invertida));
}}
