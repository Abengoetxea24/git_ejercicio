package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		int num, media, valor, cont;

		cont = 0;
		valor = 0;
		media = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num = sc.nextInt();

		while (num != 0) {
			valor = num + valor;
			num = sc.nextInt();
			cont = cont + 1;
		}
		media = valor / cont;
		System.out.println(media);
		sc.close();
	}

}
