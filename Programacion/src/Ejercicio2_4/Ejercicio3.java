package Ejercicio2_4;

import java.util.Scanner;

//Escribir la palabra introducida invertida.
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto;
        System.out.println("Escriba una palabra: ");
        texto = scan.nextLine();
        for (int posicion=texto.length()-1; posicion >= 0; posicion--  ) {
            System.out.print(texto.charAt(posicion));
        }




}}
    

