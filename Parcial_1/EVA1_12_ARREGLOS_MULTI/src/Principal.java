/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] aiMatriz = new int [5][3];
        //Filas x Columnas
        aiMatriz[0][0] = 100;
        /*System.out.println("# De filas = " + aiMatriz.length);
        for (int i = 0; i < aiMatriz.length; i++) { //Filas
            System.out.println("Fila = " + i + " - # de Columnas = " + aiMatriz[i].length);
        */    
        
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 100);
            }
        }
        
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
