package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio2 {
  
    public static void main(String[] args) {
        String nombre;
		Scanner scan = new Scanner(System.in);
        System.out.println("introdice tu nombre");
        nombre = scan.nextLine();
        System.out.println(nombre);
        scan.close();
    }

}

