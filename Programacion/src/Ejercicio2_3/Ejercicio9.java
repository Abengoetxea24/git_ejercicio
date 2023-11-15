package Ejercicio2_3;

//Escribir un programa que imprima la suma de todos los números pares que están entre 1 y 100 e imprima cuántos hay.

public class Ejercicio9 {

    public static void main(String[] args) {
        int suma=0, cont=0, i=0;
        while (i < 101){
        if(i%2==0){
            cont=cont+1;
            suma=suma+i;
        }
        i= i+1;}
        System.out.println("La suma es: "+ suma + " y hay " + cont + " numeros");
    }
}
