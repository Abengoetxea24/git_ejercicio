package Ejercicio2_3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int num, aster,i=0;
		String asterisco;
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		aster = scan.nextInt();
		asterisco="";
	

		for (num = 0; num < aster;num++) {
			asterisco=asterisco+"*";
			System.out.println(asterisco);
		
		}
		scan.close();
	}
}