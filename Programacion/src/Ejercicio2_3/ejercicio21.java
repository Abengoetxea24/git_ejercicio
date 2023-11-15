package Ejercicio2_3;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, fac, mul,val;
		

		for (val = 1; val <=5; val++) {
			System.out.println("Introduzca un numero");
			num = scan.nextInt();
			fac = 1;
			for (mul = num; mul >= 1; mul--) {
				fac = mul * fac;
			}

			System.out.println(fac);
		}

		scan.close();}

}
