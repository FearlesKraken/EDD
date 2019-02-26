/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capturar_Val_Unico;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Principal_Capturar_Val_Unico {
    
        public static void main(String[] args){
            int[] aiArreglo = new int[15];
            int iContPosicion=0;
            int iValor;
            
            do{
                System.out.println("Introduce un valor para la posicion: [" + iContPosicion +"]");
                Scanner iInput = new Scanner(System.in);
                iValor = iInput.nextInt();
                if(busqueda(iValor, aiArreglo)!=true){
                    aiArreglo[iContPosicion]=iValor;
                    iContPosicion++;
                }
            }while(iContPosicion<15);
            System.out.println("Resultado: ");
            for (int i = 0; i < aiArreglo.length; i++) {
                System.out.print("[" + aiArreglo[i] + "]");
            }
        }
        public static boolean busqueda(int iValor,int[] aiArreglo){
            boolean bCondicion=false;
            for (int i = 0; i < aiArreglo.length; i++) {
                if(iValor == aiArreglo[i]){
                    System.out.println("Valor repetido, introduce otro");
                    bCondicion = true;
                }
            }return bCondicion;
        }
}
