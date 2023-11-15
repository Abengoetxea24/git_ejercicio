package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		int num, cont;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		num = scan.nextInt();

		for (cont = 0; cont <= 100; cont += num) {
			System.out.println(cont);
		}
		scan.close();
	}

}
