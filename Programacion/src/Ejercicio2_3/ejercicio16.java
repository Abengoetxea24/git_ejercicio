package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		int num, mayor, val;

		Scanner scan = new Scanner(System.in);
		mayor = 0;

		for (val = 0; val <= 9; val++) {
			System.out.println("Dame un numero");
			num = scan.nextInt();
			if (mayor < num) {
				mayor = num;
			}
		}

		System.out.println("El numero mas grande es " + mayor);

		scan.close();
	}

}
