package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio1 {
  
    public static void main(String[] args) {
        int num1 ;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame tu nota: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        if (num1 >= 5) {
            System.out.println("Aprobado");
        } else {
             System.out.println("Suspenso");
        }
        scan.close();
    }

}