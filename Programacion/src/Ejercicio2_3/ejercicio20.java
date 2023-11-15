package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		// n = n-1 + n-2
		int fibo, fibb, val;
		Scanner scan = new Scanner(System.in);
		fibo = 0;
		fibb = 1;

		for (val = 0; val <= 4; val++) {
			System.out.println(fibo);
			fibo = fibo + fibb;
			System.out.println(fibb);
			fibb = fibo + fibb;
		}

		scan.close();
	}

}
