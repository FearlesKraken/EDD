/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiDatos[] = new int[100];
        
        for (int i = 0; i < aiDatos.length; i++) {
            //casting
            aiDatos[i] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < aiDatos.length; i++) {
            
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("-----");
        for (int aiDato : aiDatos ) {
            System.out.println("[" + aiDato + "]");
        }
    }
    
}
