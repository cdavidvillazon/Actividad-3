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
public class Ejercicio3 {
    public static void main(String[] args) {
        int ventasA[] = {1000,2000,1500,2200,1700};
        int ventasB[] = {1200,2500,3000,1000,1200};
        System.out.println("----------COMISION DE PAGO----------");
        calcularPagoA(ventasA);
        calcularPagoB(ventasB);
    }

    public static void calcularPagoA (int[] ventasA){
        double pago1 = 0;
        double pago2 = 0;
        double pagoTotal = 0;
        int suma = 0;
        for(int i=0; i<ventasA.length; i++){
            suma += ventasA[i];
        }
        System.out.println("(Categoria A) Ventas : " + suma);
        if(suma>3000 && suma<5000){
            pago1 = 200 + suma*0.09;
            pago2 = pago1*0.05;
            pagoTotal = pago1 + pago2;
        }else{
            if(suma>=5000 && suma<=7000){
                pago1 = 200 + suma*0.09;
                pago2 = pago1*0.07;
                pagoTotal = pago1 + pago2;
            }else{
                if(suma>7000){
                    pago1 = 200 + suma*0.09;
                    pago2 = pago1*0.1;
                    pagoTotal = pago1 + pago2;
                }else{
                    pago1 = 200 + suma*0.09;
                    pagoTotal = pago1;
                }
            }
        }
        System.out.println("(Categoria A) El Pago para el Vendedor es : " + pagoTotal);
    }

    public static void calcularPagoB (int[] ventasB){
        double pago1 = 0;
        double pago2 = 0;
        double pagoTotal = 0;
        int suma = 0;
        for(int i=0; i<ventasB.length; i++){
            suma += ventasB[i];
        }
        System.out.println("(Categoria B) Ventas : " + suma);
        if(suma>5000 && suma<10000){
            pago1 = 200 + suma*0.09;
            pago2 = pago1*0.07;
            pagoTotal = pago1 + pago2;
        }else{
            if(suma>=10000 && suma<=15000){
                pago1 = 200 + suma*0.09;
                pago2 = pago1*0.1;
                pagoTotal = pago1 + pago2;
            }else{
                if(suma>15000){
                    pago1 = 200 + suma*0.09;
                    pago2 = pago1*0.13;
                    pagoTotal = pago1 + pago2;
                }else{
                    pago1 = 200 + suma*0.09;
                    pagoTotal = pago1;
                }
            }
        }
        System.out.println("(Categoria B) El Pago para el Vendedor es : " + pagoTotal);
    }
}
