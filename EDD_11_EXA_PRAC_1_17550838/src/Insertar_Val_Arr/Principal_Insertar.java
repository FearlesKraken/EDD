/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertar_Val_Arr;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Principal_Insertar {
    public static void main(String[] args) {
        int cont=0;
        int[] aiInsertar = new int[15];
        
        int iValor;
        for (int i = 0; i < aiInsertar.length; i++) {
            System.out.println("Introduce el valor de la posicion: " + "[" + i + "]");
            Scanner sInput = new Scanner(System.in);
            iValor = sInput.nextInt();
            
            
            for (int j = 0; j < aiInsertar.length; j++) {
                if(j==0){
                    cont=0;
                }else{
                    cont=1;
                }
                if(iValor > aiInsertar[j-cont] && iValor < aiInsertar[j]){
                    System.out.print("i="+i);
                    System.out.print("j="+j);
                    System.out.println("cont=" + cont);
                    aiInsertar[i] = aiInsertar[j];
                    
                    aiInsertar[j] = iValor;//30 40 60
                    System.out.println(aiInsertar[0] + "" +aiInsertar[1] + "" +aiInsertar[2]);
                }else{
                    if(iValor > aiInsertar[j]){
                        System.out.println("YES1" +i+""+j);
                        aiInsertar[i] = iValor;
                    }
                    if(iValor < aiInsertar[j]){
                        System.out.println("YES2" +i+""+j);
                        aiInsertar[i] = iValor;
                    }
                }
                
                
            }
            
            for (int j = 0; j < aiInsertar.length; j++) {
                System.out.print("[" + aiInsertar[j] + "]");
            }
            System.out.println("");
        }
    }
}