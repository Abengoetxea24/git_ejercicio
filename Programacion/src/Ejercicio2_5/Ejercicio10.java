package Ejercicio2_5;

/*
Teniendo como datos la edad y el nombre de los alumnos del aula se desea sacar por pantalla la siguiente información:


El número de alumnos menores de 20 años incluidos éstos.

La edad media del aula.

Nombre y edad del alumno más joven.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] edad = { 18, 25, 19, 22, 23 };
        int min = Integer.MAX_VALUE;
        int menor = 0, cont = 0, sum = 0;
        String men = "";
        String[] nombre = { "Anton", "Isma", "Stanton", "Jon", "Ian" };
        for (int i = 0; i < 5; i++) {
            if (edad[i] < 21) {
                cont = cont + 1;
            }
            if (edad[i] < min) {
                min = edad[i];
                men = nombre[i];

            }
            sum = sum + edad[i];

        }
        System.out.println("Hay " + cont + " alumnos menores de 20 años");
        System.out.println(men + " de " + min + " años es el menor");
        System.out.println("La edad media del aula es de " + sum / 5 + " años");
    }
}
