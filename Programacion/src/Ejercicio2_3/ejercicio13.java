package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int cont, num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		num = scan.nextInt();

		for (cont = 0; cont <= num; cont++) {
			System.out.println(cont);
		}
		scan.close();
	}

}
