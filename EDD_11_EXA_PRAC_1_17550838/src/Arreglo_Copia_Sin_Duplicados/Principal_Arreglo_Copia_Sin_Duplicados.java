/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo_Copia_Sin_Duplicados;

/**
 *
 * @author Adrian
 */
public class Principal_Arreglo_Copia_Sin_Duplicados {
    
    public static void main(String[] args){
        int[] aiArreglo = new int [15],aiCopia = new int[15];
        int[] aiPosiciones = new int[15];
        int iContador1=0;
        boolean bDuplicado = false;
        System.out.println("Arreglo original: ");
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 20 + 1);
            System.out.print("[" + aiArreglo[i] + "]");
        }
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiArreglo.length; j++) {
                if(aiArreglo[i] == aiArreglo[j]){
                    if(i!=j){
                        System.out.println("Se encontro: [" + aiArreglo[i] + "] En la posicion " + i + " y " + j);
                        for (int k = 0; k < aiCopia.length; k++) {
                            if(aiPosiciones[k] != j){
                                aiPosiciones[i] = j;
                            iContador1++;
                            }
                        }
                        
                        
                    }
                }
            }
        }
        System.out.println("\nPosiciones a borrar: ");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("[" + aiPosiciones[i] + "]");
        }
        for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 0; j < aiPosiciones.length; j++) {                
                if(i == aiPosiciones[j]){
                    break;
                }else{
                    aiCopia[i]=aiArreglo[i];
                }
                
            }
        }
        System.out.println("\nArreglo copia sin duplicados: ");
        for (int i = 0; i < aiCopia.length; i++) {
            if(aiCopia[i] != 0){
            System.out.print("[" + aiCopia[i] + "]");
            }
        }
        for (int i = 0; i < aiCopia.length; i++) {
            for (int j = 0; j < aiCopia.length; j++) {
                if(aiCopia[i] == aiCopia[j]){
                    if(i!=j){
                        System.out.println("Se encontro: [" + aiCopia[i] + "] En la posicion " + i + " y " + j);
                        
                    }
                }
            }
        }
    }
}
