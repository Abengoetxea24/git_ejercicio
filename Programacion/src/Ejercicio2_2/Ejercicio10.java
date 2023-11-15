package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextInt();
        System.out.println("Escribe otro numero: ");
        num2 = scan.nextInt();
        if (num1 < num2) {
            System.out.println("Escribe otro numero: ");
            num3 = scan.nextInt();
            if (num2 < num3) {
                System.out.println("Correcto");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }

        scan.close();
    }

}