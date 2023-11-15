package Ejercicio2_5;

import java.util.Scanner;

//Llenar un array de la longitud 10 con números. Después visualizar el siguiente menú:
public class Ejercicio8 {

    public static void main(String[] args) {

        int[] gauzak = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Scanner scan = new Scanner(System.in);

        int zenb, tot, men, hand, txik, esk, kont;

        tot = 0;

        hand = 0;

        txik = 0;

        kont = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Sartu zenbaki bat");

            zenb = scan.nextInt();

            gauzak[i] = zenb;

            tot = tot + zenb;

            if (zenb > hand) {

                hand = zenb;

            }

            if (zenb < txik) {

                txik = zenb;

            }

        }

        System.out.println("--Menua--");

        System.out.println("1. Batuketa kalkulatu eta bistaratu");

        System.out.println("2. Zenbakirik altuena bistaratu");

        System.out.println("3. Zenbakirik txikiena bistaratu");

        System.out.println("4. Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.");

        men = scan.nextInt();

        switch (men) {

            case 1:

                System.out.println("Zenbakien batuketa " + tot + " da");

                break;

            case 2:

                System.out.println("Zenbakien handiena " + hand + " da");

                break;

            case 3:

                System.out.println("Zenbakien txikiena " + txik + " da");

                break;

            case 4:

                System.out.println("Zenbaki bat sartu");

                esk = scan.nextInt();

                for (int n = 0; n < gauzak.length; n++) {

                    if (gauzak[n] == esk) {

                        kont++;

                    }

                }

                System.out.println(esk + " " + kont + " alditan agertzen da");

                break;

            default:

                System.out.println("ERROR");

        }
        scan.close();
    }
}
