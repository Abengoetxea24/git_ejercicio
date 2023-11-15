package Ejercicio2_4;

import java.util.Scanner;

//Escribir la frase introducida sin espacios vacíos.
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = scan.nextLine();
        System.out.println(frase.replaceAll(" ", ""));
        
    }
    
}
