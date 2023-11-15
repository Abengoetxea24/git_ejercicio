package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio7_2 {

    public static void main(String[] args) {

        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        // num1 = Integer.parseInt(scan.nextLine());
        num1 = scan.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        scan.close();
    }

}