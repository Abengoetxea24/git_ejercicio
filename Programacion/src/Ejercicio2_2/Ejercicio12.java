package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        String Letra;
        int CV, Kw;
        double resultado;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quieres pasar de CV a Kw (C) o de Kw a CV (K)? ");
        Letra = scan.nextLine();
         scan.close();
            if (Letra.equalsIgnoreCase ("C")) {
            System.out.println("Cuantos CV? ");
                CV = scan.nextInt();
                resultado = CV*0.7457;
                System.out.println(resultado + "kw");
        }else {
            if (Letra.equalsIgnoreCase ("K")) {
                System.out.println("Cuantos Kw? ");
                Kw = scan.nextInt();
                resultado = Kw*1.34102;
                System.out.println(resultado + "CV");
            } else {
                System.out.println("ERROR");
            }}
        } 
        

       
    }
