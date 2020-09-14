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
public class Ejercicio1 {
    public static void main(String[] args){
        int codigo[] = {1,2,3,4,5,6,7,8,9};
        int valor[] = {25,30,45,15,30,40,50,20,35};
        int cantidad[] = {5,10,7,9,12,6,9,10,8};
        System.out.println("----------INFORME DE VENTAS----------");
        System.out.println("Total Productos Vendidos : " + totalProductos(cantidad));
        System.out.println("Total Ingresos por Venta : " + totalIngresos(valor, cantidad));
        System.out.println("Codigo Producto Mas Vendido : " + masVendido(cantidad, codigo));
        System.out.println("Codigo Producto Mas Costoso : " + masCostoso(valor, codigo));
    }
    
    public static int totalProductos (int[] cantidad){
        int suma = 0;
        for(int i=0; i<cantidad.length; i++){
            suma += cantidad[i];
        }
        return suma;
    }
    
    public static int totalIngresos (int[] valor, int[] cantidad){
        int total = 0;
        for(int i=0; i<valor.length; i++){
            for(int j=0; j<cantidad.length; j++){
                i = j;
                total += valor[i]*cantidad[j];
            }    
        }
        return total;
    }
    
    public static int masVendido (int[] cantidad, int[] codigo){
        int mayor = 0;
        int producto = 0;
        for(int i=0; i<cantidad.length; i++){
            for(int j=0; j<codigo.length; j++){
                i = j;
                if(cantidad[i] > mayor){
                    mayor = cantidad[i];
                    producto = codigo[j];
                }
            }    
        }
        return producto;
    }
    
    public static int masCostoso (int[] valor, int[] codigo){
        int mayor = 0;
        int producto = 0;
        for(int i=0; i<valor.length; i++){
            for(int j=0; j<codigo.length; j++){
                i = j;
                if(valor[i] > mayor){
                    mayor = valor[i];
                    producto = codigo[j];
                }
            }    
        }
        return producto;
    }
}
