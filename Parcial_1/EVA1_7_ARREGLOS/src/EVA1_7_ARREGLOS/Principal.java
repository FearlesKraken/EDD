package EVA1_7_ARREGLOS;

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
        int x[] = new int [100];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * 100 + 1);
            
        }
        System.out.println(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + x[i] + "]");
            
        }
        System.out.println("");
        int i = 5;
        int iCopia = i;
        System.out.println("i = " + i + " iCopia = " + iCopia);
        i = 100;
        System.out.println("i = " + i + " iCopia = " + iCopia);
        int[] aiCopia = x;
        for (int j = 0; j < aiCopia.length; j++) {
            System.out.print("[" + aiCopia[j] + "]");
            
        }
        x[0]= 10000;
        System.out.println("");
        for (int j = 0; j < aiCopia.length; j++) {
            System.out.print("[" + aiCopia[j] + "]");
            
        }
        System.out.println("");
        System.out.println(x);
        System.out.println(aiCopia);
        //El duplicado de arreglos
        int[] aiCopiaReal = new int[100];
        for (int j = 0; j < x.length; j++) {
            aiCopiaReal[j] = x[j];
        }
        System.out.println(x);
        System.out.println(aiCopiaReal);
    }
    
}
