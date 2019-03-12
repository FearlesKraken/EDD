/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ?
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[1000000];
        for (int i = 0; i < aiDatos.length; i++) {
            for (int ç = 0; ç < aiDatos.length; ç++) {
                aiDatos[i] = (int)(Math.random() * 100);
            }
            
        }
    }
    
}
