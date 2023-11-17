package Ejercicio2_6;
import java.util.Scanner;
import java.net.StandardSocketOptions;

/*Crear un método llamado calcularAreaCirculo

Parámetros recibidos: int diámetro

Return: double area*/
public class Ejercicio4 {
    public static void main(String[] args) {
        double diam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuanto es el diametro? ");
        diam= scan.nextDouble();
        System.out.println("El area es; " + calculator(diam));
    }
    public static double calculator(double diam){
        double  res=0.0;
        double radio = diam / 2;
        res = radio * 3.141632;
        return res;
    }
}
