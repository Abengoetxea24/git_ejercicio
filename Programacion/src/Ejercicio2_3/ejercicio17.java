package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		
		int num, mayor, val, menor;

		Scanner scan = new Scanner(System.in);
		mayor = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;

		for (val = 0; val <= 9; val++) {
			System.out.println("Dame un numero");
			num = scan.nextInt();
			if (mayor < num) {
				mayor = num;
			}
			if (num < menor) {
					menor = num;
				}
			
		}
		
		System.out.println("El numero mas grande es " + mayor + "Y el mas pequeño " + menor);

		scan.close();
	}
	

}
