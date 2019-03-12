
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
public class Principal_5 {

    public static void main(String[] args) {
        System.out.println("Introduce una serie de parentesis: ");
        Scanner iInput = new Scanner(System.in);
        String sPalabra = iInput.next();
        int iInicio = 0;
        int iFin = (sPalabra.length() - 1);
        boolean bCondicion = false;
        System.out.println(recursividad(sPalabra, iInicio, iFin, bCondicion));

    }

    public static boolean recursividad(String sPalabra, int iInicio, int iFin, boolean bCondicion) {
        //System.out.println(sPalabra.length());
        String cLetraI = Character.toString(sPalabra.charAt(iInicio));
        String cLetraF = Character.toString(sPalabra.charAt(iFin));
        String sCero = cLetraI + cLetraF;
        //System.out.println(iFin);

        if (iInicio < (iFin / 2) || iInicio == 0 || iFin == iInicio + 1) {
            //System.out.println("entra");
            if (sCero.equals("()")) {
                bCondicion = true;

            } else {
                bCondicion = false;

            }
            return recursividad(sPalabra, iInicio + 1, iFin - 1, bCondicion);
        }else{
            
        }
        return bCondicion;
    }
}
