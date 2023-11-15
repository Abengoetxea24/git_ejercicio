package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {

		int mach, human, cont;
		cont = 0;

		Scanner scan = new Scanner(System.in);
		mach = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
		System.out.println();
		human = scan.nextInt();
		while (human != mach) {
			if (human < mach) {
				System.out.println("el numero es mayor");
				human = scan.nextInt();
			} else {
				if (human > mach) {
					System.out.println("el numero es menor");
					human = scan.nextInt();
				}
			}
			cont = cont + 1;
		}
		System.out.println("lo has intentado" + cont + "veces");
		scan.close();
	}

}
