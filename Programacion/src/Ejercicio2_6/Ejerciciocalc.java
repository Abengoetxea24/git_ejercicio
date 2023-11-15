package Ejercicio2_6;

import java.util.Scanner;

public class Ejerciciocalc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

            System.out.println ("Escribe un num");
            int numT = Integer.parseInt(scanner.nextLine());

            System.out.println ("Escribe otro num");
            int numT2 = scanner.nextInt();
            System.out.println("Que quieres hacer sumar(s) restar(r) multiplicar(m)" );

            String que = scanner.next();

            calculadora(numT,numT2,que);


        scanner.close();
     
    }

    public static double calculadora(double num1, double num2, String que) {
        double resul=250000;
    	if (que.equals("s")){
            System.out.println (num1+num2);
            resul= num1+num2;
        }
        else if (que.equals("r")){
            resul= num1-num2;
        }
        else  if (que.equals("m"))
        {
            System.out.println (num1*num2);
            resul =num1*num2;
        }  
        
        return resul;
    }

}