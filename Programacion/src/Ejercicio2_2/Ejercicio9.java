package Ejercicio2_2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Usuario: ");
        // num1 = Integer.parseInt(scan.nextLine());
        // usuario=scan.nextLine();
        String usuario = scan.nextLine();

        System.out.println("Contraseña: ");
        // num2 = Integer.parseInt(scan.nextLine());
        // contraseña=scan.nextLine();
        String contraseña = scan.nextLine();
        if (usuario.equalsIgnoreCase("ikaslea") && contraseña.equals("ik1920")) {
            System.out.println("Correcto!!");
        } else {
            System.out.println("Usuario/contraseña incorrecto");
        }

        scan.close();
    }

}