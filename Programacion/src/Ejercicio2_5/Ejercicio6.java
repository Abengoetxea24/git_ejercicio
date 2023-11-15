package Ejercicio2_5;

//5 luzerako arraia definitu eta izenez bete. Erabiltzaileari izen bat eskatu eta arraian dagoen edo ez adierazi.
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean existe = false;
        String[] nombres = { "Aimar", "Nico", "Paul", "Rua", "Isma" };
        System.out.println("Dame un nombre: ");
        String comparar = scan.nextLine();
        for (int i = 0; i < 5; i++) {

            if (comparar.equals(nombres[i])) {
                existe=true;  } 

        }
        if (existe) {
            System.out.println("El nombre esta en la base de datos: ");

        } else {
            System.out.println("El nombre no esta en la base de datos: ");

        }

    }
}
