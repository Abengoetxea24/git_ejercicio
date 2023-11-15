package Ejercicio2_6;
//Crear un método para que convierta, la cantidad introducida en Euros a pesetas.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euros;
        System.out.println("Cantidad de euros: ");
        euros = scan.nextDouble();
        System.out.println(conversor(euros) + "pesetas");
    }
    public static double conversor(double euros){
        double resultado;
        resultado = euros * 166.386;
        return resultado;

    }
}
