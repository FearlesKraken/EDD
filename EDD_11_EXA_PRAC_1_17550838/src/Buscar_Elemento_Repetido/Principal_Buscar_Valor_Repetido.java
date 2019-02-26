/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscar_Elemento_Repetido;

/**
 *
 * @author Adrian
 */
public class Principal_Buscar_Valor_Repetido {
    public static void main(String[] args){
        int[] aiArreglo = new int[15];
        boolean bEncontro = false;
        int iContador=0;
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 20 + 1);
            System.out.print("[" + aiArreglo[i] + "]");
        }
        do{ 
            for (int i = 0; i < aiArreglo.length; i++) {                
                for (int j = 0; j < aiArreglo.length; j++) {
                    if(aiArreglo[i] == aiArreglo[j]){
                        if(i!=j){
                        System.out.println("Se encontro: [" + aiArreglo[i] + "] En la posicion " + i + " y " + j);
                        bEncontro = true;
                        break;
                        }
                    }
                }
                if(bEncontro==true)break;
            }
        }while(bEncontro == false);
    }
    
        
}
