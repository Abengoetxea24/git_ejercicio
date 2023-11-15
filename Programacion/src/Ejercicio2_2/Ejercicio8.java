package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio8 {
  
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una letra: ");
            char letra = scanner.next().charAt(0);
            scanner.close();
      switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(letra + " es una vocal.");
            break;
        default:
            System.out.println(letra + " no es una vocal.");
    }
}
  
    }


