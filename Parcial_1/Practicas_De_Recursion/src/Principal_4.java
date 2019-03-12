
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
public class Principal_4 {

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
        int iCont2 = (sPalabra.length() - 1);
        String cLetra2 = "";
        if(iCont < iCont2){
            cLetra2 = Character.toString(sPalabra.charAt(iCont + 1));
        }
        if (iCont != iCont2 + 1) {
            String cLetra1 = Character.toString(sPalabra.charAt(iCont));
            
            if (cLetra1.equals(cLetra2)) {
                System.out.print("");
            } else {
                System.out.print(cLetra1);
            }
            recursividad(sPalabra, iCont + 1);
        }
    }
}
