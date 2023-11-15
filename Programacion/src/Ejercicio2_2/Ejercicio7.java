package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio7 {
  
    public static void main(String[] args) {
      
        int num1;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
        if (num1 == 1) {
            System.out.println("Lunes");
        }
        if (num1 == 2) {
            System.out.println("Martes");
        }
        if (num1 == 3) {
            System.out.println("Miercoles");
        }
        if (num1 == 4) {
            System.out.println("Jueves");
        }
        if (num1 == 5) {
            System.out.println("Viernes");
        }
        if (num1 == 6) {
            System.out.println("Sabado");
        }
        if (num1 == 7) {
            System.out.println("Domingo");
        }
     

     
        
        scan.close();
    }

}