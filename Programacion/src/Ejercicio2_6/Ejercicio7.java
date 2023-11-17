package Ejercicio2_6;

public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i= 0; i < 500;i++){
            int num1= i;
            primo(num1);
        }
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

        }


    }
}

