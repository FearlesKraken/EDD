/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiArreglo = new int[100];
        llenar(aiArreglo);
        imprimir(aiArreglo);
    }
    public static void llenar(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100 + 1);
        }
    }
    public static void imprimir(int[] aiDatos){
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
    }
    
}
