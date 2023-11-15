package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int num, aster;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		aster = scan.nextInt();
		for (num = 0; num < aster; num++) {
			System.out.println("*");
		}
		scan.close();
	}}