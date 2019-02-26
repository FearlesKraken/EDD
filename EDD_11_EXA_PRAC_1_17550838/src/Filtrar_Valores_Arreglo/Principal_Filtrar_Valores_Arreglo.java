/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtrar_Valores_Arreglo;

/**
 *
 * @author Adrian
 */
public class Principal_Filtrar_Valores_Arreglo {
    
        public static void main(String[] args){
            int[] aiArreglo = new int[15];
            boolean bPrimo=false;
            for (int i = 0; i < aiArreglo.length; i++) {
                aiArreglo[i] = (int)(Math.random() *100 + 1);
                System.out.print("[" + aiArreglo[i] + "]");
            }
            System.out.println("\nSolo los valores pares:");
            for (int i = 0; i < aiArreglo.length; i++) {
                if((aiArreglo[i]%2)==0){
                    System.out.print("[" + aiArreglo[i] +"]");
                }
            }
            System.out.println("\nSolo los valores impares:");
            for (int i = 0; i < aiArreglo.length; i++) {
                if((aiArreglo[i]%2)>0){
                    System.out.print("[" + aiArreglo[i] + "]");
                }
            }
            System.out.println("\nSolos los valores primos:");
            for (int i = 0; i < aiArreglo.length; i++) {
                if((primo(aiArreglo[i])) == true){
                    System.out.print("[" + aiArreglo[i] + "]");
                }
            }
            
        }
        public static boolean primo(int aiArreglo){
            int iContador = 0;
            boolean bPrimo = false;
            for(int i = aiArreglo; i > 0; i--){
                if(aiArreglo % i == 0 ){
                iContador++;
                }
            }
            if(iContador == 2){
                bPrimo = true;
            }
            return bPrimo;
            }
}
