package Ejercicio2_5;
/*
 * Como dato de entrada tenemos la temperatura diaria de la semana en Cº. Como resultado queremos:

Temperatura media semanal en ªF

El día más caluroso

Y los nombres de los días que han superado la media.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int [] temp = {5,12,16,20,6,7,18};
        int tot=0, max= Integer.MIN_VALUE;
        double med;
        String maxd=" ";
        String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (int i=0; i<7;i++){
            tot= tot + temp[i];
            if (temp[i] > max){
                max = temp[i];
                maxd = dia[i];
            }
        }
        med = tot/7;
        
        System.out.println("La temperatura media semanl es Fº es de " +  (((med*9)/5)+32) );
        System.out.println("La temperatura maxima de la semana fue el " + maxd + " con " + max + " Grados");
        for (int i=0; i<7;i++){
            if(temp[i] > med ){
                System.out.println("El " + dia[i] + " se supero la temperatura madia semanal. ");
            }
        }
    }
}

