
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
        int iPrimero = sInput.nextInt();
        System.out.println("Introduce otro numero: ");
        int iSegundo = sInput.nextInt();
        sInput.nextLine();
        //System.out.println(iPrimero%iSegundo + " " + iPrimero/iSegundo); //=36
        int iMayor,iMenor;
        if(iPrimero>iSegundo){
            iMayor = iPrimero;
            iMenor = iSegundo;
        }
        else{
            iMayor = iSegundo;
            iMenor = iPrimero;
        }
        System.out.println("Maximo comun divisor: " + maxComDiv(iMayor, iMenor));
        
    }
    public static int maxComDiv(int uno,int dos){
        
        // 180 y 48
        int calres;
        int caldiv;
        int x=2;
        if(uno == 0){
            return dos;
        }
        else{
            
            calres = uno%dos; //36 , 0
            caldiv = uno/dos; // 3 , 12
            System.out.println("div: " + caldiv);
            System.out.println("res: " + calres);
            return maxComDiv(calres, caldiv);
        }
    }
    
}
