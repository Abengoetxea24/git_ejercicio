package Ejercicio2_5;
/*
  Crear dos arrays: arrMes eta arrLitros. En el primer array guardar meses de Enero a May
  y en el segundo los litros de lluvia 123, 333,180,211,90.


Ejemplo:

arrMes[0] -- enero

arrLitros[0] -- 123


Visualizar la cantidad de litros de lluvia que ha hecho en cada mes.

Calcular cual ha sido el mes más lluvioso. Visualizar el mes y los litros en pantalla.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
    int [] litros = {123,333,180,211,90};
    int max=0 ;
    String maxm = "";
    String [] meses = new String [5];
    meses[0] = "enero";
    meses[1] = "Febrero";
    meses[2] = "Marzo";
    meses[3] = "Abril";
    meses[4] = "Mayo";
    for (int i=0; i < 5; i++){
        System.out.println("En el mes de " + meses[i]+ " cayeron " + litros[i] + "L de agua.");
        if (litros[i] > max){
            max=litros[i] ;
            maxm=meses[i]  ;
        }
       
    } System.out.println("En el mes de " + maxm + " hubo un maxima de "+ max + " Litros. ");
    }
}
