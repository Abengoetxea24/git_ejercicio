package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio2 {
  
    public static void main(String[] args) {
        int num1,num2 ;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        System.out.println("Dame otro numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num2=scan.nextInt();

        if (num1 > num2) {
            System.out.println("mayor");
        } else {
             System.out.println("menor");
             if (num1 == num2) {
            System.out.println("igual");
        }
       
        } 
        scan.close();
    }

}   