package Ejercicio2_4;

import java.util.Scanner;

//Escribir en tres líneas una dirección web. 
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la direccion web: ");
        String link = scan.nextLine();
        System.out.println(link.replaceAll("\\.", "\n"));
        
    }
}
