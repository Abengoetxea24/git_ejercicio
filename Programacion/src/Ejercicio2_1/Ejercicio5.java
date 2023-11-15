package Ejercicio2_1;

import java.util.Scanner;

public class Ejercicio5 {
  
    public static void main(String[] args) {
        int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        System.out.println("Introduzca otro numero");
       // num2 = Integer.parseInt(scan.nextLine());
          num2=scan.nextInt();
           System.out.println("Introduzca otro numero");
       // num3 = Integer.parseInt(scan.nextLine());
          num3=scan.nextInt();
        System.out.println("La multiplicación de los numeros es: " + (num1*num2*num3));
        scan.close();
    }

}