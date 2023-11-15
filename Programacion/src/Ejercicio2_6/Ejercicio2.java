package Ejercicio2_6;
//Crear un método (función) que reciba un double “cantidadDeDinero” y un char “monedaDeCambio”
//Si recibe una D quiere decir que la cantidadEsta en Euros y tiene que devolver en Dólares.
// Tiene que funcionar con “monedaDeCambio” mayúsculas y minúsculas.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double dinero;
        String moneda;
        Scanner scan= new Scanner(System.in);
        System.out.println("Cantidad de dinero: ");
        dinero= scan.nextDouble();
        System.out.println("Moneda de cambio (dolar (d)): ");
        moneda= scan.next();

        System.out.println("El cambio a dolares es" + cantidaddedinero(dinero,moneda));



    }
    public static double cantidaddedinero(double dinero, String moneda){
        double resultado=0;
        if (moneda.equals ("d")){
            resultado= dinero *	1.06675;
        }



        return resultado;
    }
}
