/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verificar_Suma_En_Matriz;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Principal_Verificar_Suma_En_Matriz {

    public static void main(String[] args) {
        int[][] aiMatriz = new int[4][4];
        int[] aiSumas = new int[16];
        int[] aiPosiciones = new int[16];
        int iValor, iSuma = 0;
        Scanner iInput = new Scanner(System.in);
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                do {
                    System.out.println("Inserte valor para la posicion [" + i + "] " + "[" + j + "] Entre 0 y 9");
                    iValor = iInput.nextInt();
                } while (iValor > 10 || iValor < 0);

                aiMatriz[i][j] = iValor;
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                iSuma += aiMatriz[i][j];
                if (j == 3) {
                    aiPosiciones[i] = i;
                    aiSumas[i] = iSuma;
                    System.out.println(iSuma);
                }
            }
            iSuma = 0;
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                iSuma += aiMatriz[j][i];
                if (j == 3) {
                    aiPosiciones[j+3] = i;
                    aiSumas[j] = iSuma;
                    System.out.println(iSuma);
                }
            }
            iSuma = 0;
        }

        for (int i = 0; i < 8; i++) {
         System.out.print("Sumas: [" + aiSumas[i] + "]");
         System.out.print("Posiciones: [" + aiPosiciones[i] + "]");
         }
    }

}
