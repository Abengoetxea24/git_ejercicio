package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio3 {
  
    public static void main(String[] args) {
        int num1;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();

        if (num1 > 0) {
            System.out.println("Positivo");
        } else {
             if (num1 == 0) {
            System.out.println("0");
        } else {
            System.out.println("Negativo");
        }}
        scan.close();
    }

    }