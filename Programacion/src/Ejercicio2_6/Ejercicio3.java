package Ejercicio2_6;
import java.util.Scanner;
/* Crear un método (procedimiento) que escriba en pantalla el cambio entre diferentes monedas. Recibirá 3 parámetros:

double cantidad

char monedaIn: posibles valores: E, D, B -> euro, dolar, bitcoin

char modedaOut: posibles valores: E, D, B -> euro, dolar, bitcoin

Deberá realizar el cambio de monedaIn a monedaOut y escribir en pantalla.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        String ent, sal;
        Scanner scan= new Scanner(System.in);
        System.out.println("Moneda entrante (E, D, B -> euro, dolar, bitcoin)");
        ent = scan.nextLine();
        System.out.println("Moneda a la que quieres cambiar (E, D, B -> euro, dolar, bitcoin)");
        sal = scan.nextLine();
        System.out.println("El resultado es: " + cambio(ent,sal));

    }
    public static double cambio(String ent, String sal){
        Scanner scan= new Scanner(System.in);
        double res =0, cant=0;
        System.out.println("Cuanto es la cantidad de entrada? ");
        cant = scan.nextDouble();

        if (ent.equals ("E") && sal.equals("D")){
            res= cant* 1.08;
        }
        if (ent.equals ("E") && sal.equals("B")){
            res= cant* 0.000030;
        }
        if (ent.equals ("D") && sal.equals("E")){
            res= cant* 0.92;
        }
        if (ent.equals ("D") && sal.equals("B")){
            res= cant* 0.000028;
        }
        if (ent.equals ("B") && sal.equals("E")){
            res= cant / 0.000030;
        }
        if (ent.equals ("B") && sal.equals("D")){
            res= cant/ 0.000028;
        }
        return res;
    }
}
