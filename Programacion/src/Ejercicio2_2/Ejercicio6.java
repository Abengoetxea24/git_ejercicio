package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio6 {
  
    public static void main(String[] args) {
        int num1, num2, num3, suma = -1;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
         System.out.println("Dame un numero: ");
      //  num2 = Integer.parseInt(scan.nextLine());
        num2=scan.nextInt();
         System.out.println("Dame un numero: ");
      //  num3 = Integer.parseInt(scan.nextLine());
        num3=scan.nextInt();

        suma = num1+num2+num3;
        System.out.println("La sumna es: " + suma + " Y la media: " + suma/3);
        
        scan.close();
    }

}