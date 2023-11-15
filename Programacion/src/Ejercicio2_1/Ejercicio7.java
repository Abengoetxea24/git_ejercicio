package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio7 {
  
    public static void main(String[] args) {
        int num1, num2 ;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame la medida de un lado del cateto ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        System.out.println("Dame la medida del otro lado del cateto ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num2=scan.nextInt();
        System.out.println("El area del cuadrado es: " + (num1*num2));
  
        scan.close();
    }

}