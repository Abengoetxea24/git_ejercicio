package Ejercicio2_6;
import java.util.Scanner;
/*Crear una función calcularAreaTriangulo que reciba la base y
la altura y escriba en pantalla su área.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        double base, altura;
        Scanner scan =new Scanner(System.in);
        System.out.println("Base del triangulo?");
        base = scan.nextDouble();
        System.out.println("Altura del triangulo?");
        altura = scan.nextDouble();
        System.out.println(calculator(altura,base));
    }
    public static double calculator(double altura, double base){
        double res=0;
        res = base*altura;
        return res;
    }
}
