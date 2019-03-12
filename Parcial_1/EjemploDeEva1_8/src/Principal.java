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
        int iVal = 0;
        llenar(iVal);
        imprimir(iVal);
    }
    public static void llenar(int aiDato){
        aiDato=100;
    }
    public static void imprimir(int aiDato){
        System.out.println("Valor = " + aiDato);
    }
    
}
