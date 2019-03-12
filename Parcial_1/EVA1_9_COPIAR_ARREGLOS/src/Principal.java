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
        int[] x = new int[10];
        int[] y = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i]=(int)(Math.random() * 100 + 1);
            y[i]=x[i];
        }
        System.out.print("Arreglo 1: " + x);
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + x[i] + "]");
        }
        
        System.out.print("\nArreglo 2: " + y);
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + y[i] + "]");
        }
    }
    
}
