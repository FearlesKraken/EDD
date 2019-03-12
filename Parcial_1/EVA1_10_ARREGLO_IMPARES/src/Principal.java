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
        // Arreglo de 100 elementos
        //Llenar de aleatorios
        //Sobre el mismo arreglo --> Dejar unicamente los numeros impares
        //imprimir
        //aiDatos --> [1][6][3][10][9] --> 5 Elementos
        //aiDatos --> [1][3][9] --> 3 Elementos

        int[] arreglo = new int[100]; //Arreglo
        float impar;
        int contador=0;
        
        System.out.println("Arreglo inicial: ");
        for (int i = 0; i < arreglo.length; i++) { //Llenado de aleatorios
            arreglo[i]=(int)(Math.random() * 100 + 1);
            impar = (float)arreglo[i]/2;
            System.out.print("[" + arreglo[i] + "]");
            
            if(impar %1 == 0){ //Dejar solo los impares (en otro arreglo)
                contador++;
            }
            
        }
        //System.out.println("Contador: "+ contador);
        int[] posicion = new int[contador];
        contador=0;
        for (int i = 0; i < arreglo.length; i++) {
            impar = (float)arreglo[i]/2;
            
            if(impar %1 == 0){ //Dejar solo los impares (en otro arreglo)
                
                posicion[contador] = arreglo[i];
                contador++;
            }
            
        }
        
        System.out.println("\nMismo arreglo con solo impares: ");
        arreglo = new int[contador];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = posicion[i];
            System.out.print("[" + arreglo[i] + "]");//Imprimir el mismo arreglo con impares
        }
        
        
    }
    
}

