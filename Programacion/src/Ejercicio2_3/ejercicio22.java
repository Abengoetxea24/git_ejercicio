package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int human;
		

		System.out.println("1. Multiplo de 3 ");
		System.out.println("2. Fibonnaci ");
		System.out.println("3. Factorial ");
		System.out.println("4. Salir ");
human = scan.nextInt();
		switch (human) {

		case 1:
			System.out.println(" multiplo de 3");
			break;
		case 2:
			System.out.println(" Fibonnaci");
			break;
		case 3:
			System.out.println(" Factorial");
			break;
		case 4:
			System.out.println("SALIR");
			break;
		}

		scan.close();
	}

}
