/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author CARLOS VILLAZON
 */
public class Ejercicio4 {
    public static void main(String[] args){
        int empleados[] = {1,2,3,4,5};
        int horas[] = {35,40,45,55,60};
        int tarifa[] = {30,30,30,30,30};
        System.out.println("----------SUELDO DE EMPLEADOS----------");
        mostrarSueldo(horas, tarifa);
    }
    
    public static void mostrarSueldo (int[] horas, int[] tarifa){
        double sueldo = 0;
        int extras = horasExtras(horas);
        for(int i=0; i<horas.length; i++){
            for(int j=0; j<tarifa.length; j++){
                i = j;
                if(horas[i] > 40){
                    sueldo = (extras*(tarifa[j]+(tarifa[j]*0.5))) + ((horas[i]-extras)*tarifa[j]);
                }else{
                    sueldo = horas[i]*tarifa[j];
                }
                System.out.print(" --> " + sueldo);
            }    
        }
        System.out.println("");
    }
    
    public static int horasExtras (int[] horas){
        for(int i=0; i<horas.length; i++){
            if(horas[i] > 40){
                return horas[i] - 40;
            }
        }
        return 0;
    }
}
