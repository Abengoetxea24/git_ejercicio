package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio6 {
  
    public static void main(String[] args) {
        int num1 ;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame la temperatura en ºC: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        System.out.println("La temperatura en ºF es: " + (num1*1.18+32));
  
        scan.close();
    }

}