package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

		int num1, num2;

		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		num2 = scan.nextInt();
		for (num1 = 0; num1 <= 10; num1++) {
			System.out.println(num1 * num2);
		}
		scan.close();
	}

}
