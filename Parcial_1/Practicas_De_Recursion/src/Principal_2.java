
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrian
 */
public class Principal_2 {

    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        Scanner iInput = new Scanner(System.in);
        String sPalabra = iInput.next();
        int iCont1 = 0;
        recursividad(sPalabra, iCont1);
        System.out.println("");
    }

    public static void recursividad(String sPalabra, int iCont) {
        //System.out.println(sPalabra.length());
        int iCont2 = (sPalabra.length()-1);
        
        if (iCont != iCont2 + 1) {
            String cLetra = Character.toString(sPalabra.charAt(iCont));
            if (cLetra.equals("x")) {
                System.out.print("");
            }else{
                System.out.print(cLetra);
            }
            recursividad(sPalabra, iCont + 1);
        }
    }
}
