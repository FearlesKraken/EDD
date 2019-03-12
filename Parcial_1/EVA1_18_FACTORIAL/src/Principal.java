
import java.util.Scanner;

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
        Scanner sInput = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int iNum = sInput.nextInt();
        sInput.nextLine();
        //System.out.println("Factorial = " + Factorial(iNum));
        System.out.println("Factorial = " + calculaFactorial(iNum));
        
    }
    
    public static int Factorial(int iVal){
        int iResu = 1;
        for (int i = 1; i <=iVal; i++) {
            iResu = iResu * i;
        }
        return iResu;
    }
    public static int calculaFactorial(int iVal){
        if(iVal==0){
            return 1;
        }
        else{
            return iVal * calculaFactorial(iVal - 1);
                    }
    }
    
}
