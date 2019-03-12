
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        Scanner sInput = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int iVal = sInput.nextInt();
        int num=1;
        sInput.nextLine();
        forRecursivo(iVal);
        System.out.println("");
        forRecursivoMenorMayor(iVal,num);
        
    }
    public static void forRecursivo(int iVal){
        /*
        1. Llamarse a si mismo
        2. Debe tener la recursividad
        */
        System.out.print(iVal + " - ");
        
        if(iVal > 1){
        forRecursivo(iVal - 1);
        }
                
}
    
    public static void forRecursivoMenorMayor(int iVal,int num){
        System.out.print(num + " - ");
        
        num++;
        
        if(num <= iVal){
            forRecursivoMenorMayor(iVal,num);
        }
    }
}
