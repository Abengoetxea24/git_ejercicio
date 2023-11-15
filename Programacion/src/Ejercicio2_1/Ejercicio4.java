package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio4 {
  
    public static void main(String[] args) {
        int num1, num2;
		Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        System.out.println("Introduzc otro numero");
       // num2 = Integer.parseInt(scan.nextLine());
          num2=scan.nextInt();
        System.out.println("La suma de los numero es: " + (num1+num2));
        scan.close();
    }

}