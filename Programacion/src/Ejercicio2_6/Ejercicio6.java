package Ejercicio2_6;
import java.util.Scanner;
/*Crear una función llamada esPrimo: recibe un int y devuelve un booleano.*/
public class Ejercicio6 {
    public static void main(String[] args) {
        int num1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        num1 = scan.nextInt();
        primo(num1);

    }
    public static void primo(int num1){
        int cont=0;

        for (int i = num1; i > 0; i-- ){
            if (num1 % i == 0) {
                cont = cont+1;
        }
        }
            if (cont == 2) {
                System.out.println(num1 + " es un número primo.");
            } else {
                System.out.println(num1 + " no es un número primo.");
            }


}}



