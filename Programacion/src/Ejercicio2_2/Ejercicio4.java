package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio4 {
  
    public static void main(String[] args) {
        int num1;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();

        if (num1 % 2 ==0 ) {
            System.out.println("par");
        } else {
            System.out.println("inpar");
        }
        scan.close();
    }

    }