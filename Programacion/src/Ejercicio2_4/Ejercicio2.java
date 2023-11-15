package Ejercicio2_4;

import java.util.Scanner;

//Introducir por teclado una frase y sacar por pantalla un carácter por cada línea.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto;
        System.out.println("Escriba una frase: ");
        texto = scan.nextLine();
        for (int posicion=0; posicion < texto.length(); posicion++  ) {
            System.out.println(texto.charAt(posicion));
        }




}}
