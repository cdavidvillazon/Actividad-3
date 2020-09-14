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
public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("----------CONVERSION DE BASE----------");
        System.out.print(convertirBase2(186, 2));
        System.out.println(" ---> Binario");
        int[] binario = {1,0,1,1,1,0,1,0};
        int i, j=7, resultado=0;
        for(i=0; i<8; i++){
            resultado += binario[j]*convertirBase10(2,i);
            j--;
        }
        System.out.print(" " + resultado);
        System.out.println(" ---> Decimal");
    }
    
    private static String convertirBase2 (int numero, int base){
        int residuo = 0;
        while(numero >= base){
            residuo = numero%base;
            numero = numero/base;
            System.out.print(" " + residuo);
        }
        return " " + numero;
    }
    
    private static int convertirBase10 (int base, int exponente){
        int i;
        int potencia = 1;
        for(i=0; i<exponente; i++){
            potencia = potencia*base;
        }
        return potencia;
    }
}
