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
        int [][] aiDatos = new int [3][];
        
        aiDatos[0] = new int[10];
        aiDatos[1] = new int[3];
        aiDatos[2] = new int[7];
        
        for (int i = 0; i < aiDatos.length; i++) {
            for (int j = 0; j < aiDatos[i].length; j++) {
                aiDatos[i][j] = (int)(Math.random() * 100);
            }
        }
        
        for (int i = 0; i < aiDatos.length; i++) {
            for (int j = 0; j < aiDatos[i].length; j++) {
                System.out.print("[" + aiDatos[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
