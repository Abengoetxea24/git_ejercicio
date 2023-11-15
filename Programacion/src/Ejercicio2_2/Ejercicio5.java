package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio5 {
  
    public static void main(String[] args) {
        int num1;
		Scanner scan = new Scanner(System.in);
        System.out.println("Dame un numero: ");
      //  num1 = Integer.parseInt(scan.nextLine());
        num1=scan.nextInt();
//no he podido poner >= de una solo ????
        if (num1 > 0 & num1 < 10 ) {
            
            System.out.println("si");
        } else { if (num1 == 0 ) {
            System.out.println("si");
        } else { if (num1 == 10){
            System.out.println("si");
        }else {
            System.out.println("no");
        }}}
    

        
        scan.close();
    }

    }