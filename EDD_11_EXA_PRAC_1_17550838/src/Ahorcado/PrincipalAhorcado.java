package Ahorcado;

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
public class PrincipalAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] asPalabras = new String[5][10];
        String[] asPalabrasBien = new String[10];
        boolean bCondicion = false;
        boolean bCondicion2 = false;
        for (int i = 0; i < asPalabrasBien.length; i++) {
            asPalabrasBien[i] = "";
        }
        int iSeleccion, iCantLetras = 0, iContadorBien = 0, iContadorMal = 0;
        String sEleccion, sPalabra,sEleccion2;
        asPalabras[0][0] = "c";
        asPalabras[0][1] = "a";
        asPalabras[0][2] = "r";
        asPalabras[0][3] = "r";
        asPalabras[0][4] = "o";

        asPalabras[1][0] = "p";
        asPalabras[1][1] = "e";
        asPalabras[1][2] = "r";
        asPalabras[1][3] = "r";
        asPalabras[1][4] = "o";

        asPalabras[2][0] = "d";
        asPalabras[2][1] = "o";
        asPalabras[2][2] = "c";
        asPalabras[2][3] = "t";
        asPalabras[2][4] = "o";
        asPalabras[2][5] = "r";

        asPalabras[3][0] = "b";
        asPalabras[3][1] = "o";
        asPalabras[3][2] = "m";
        asPalabras[3][3] = "b";
        asPalabras[3][4] = "e";
        asPalabras[3][5] = "r";
        asPalabras[3][6] = "o";

        asPalabras[4][0] = "a";
        asPalabras[4][1] = "n";
        asPalabras[4][2] = "a";
        asPalabras[4][3] = "l";
        asPalabras[4][4] = "i";
        asPalabras[4][5] = "t";
        asPalabras[4][6] = "i";
        asPalabras[4][7] = "c";
        asPalabras[4][8] = "o";
        do{
            bCondicion2 = false;
        do {
            iSeleccion = (int) (Math.random() * 10);
        } while (iSeleccion > 4);
        System.out.println(iSeleccion);
        System.out.println("Ahorcado");
        for (int i = 0; i < asPalabras[iSeleccion].length; i++) {
            if (asPalabras[iSeleccion][i] != null) {
                System.out.print("[" + "]");
                iCantLetras++;
            }
        }
        Scanner sInput = new Scanner(System.in);
        System.out.println("\n¿Conoces la palabra? (y/n)");
        sEleccion = sInput.next().toLowerCase();
        if (sEleccion.equals("y")) {
            System.out.println("Escribe la palabra");
            sPalabra = sInput.next().toLowerCase();

            if (sPalabra.length() == iCantLetras) {
                for (int i = 0; i < sPalabra.length(); i++) {
                    String cLetra = Character.toString(sPalabra.charAt(i));

                    if (cLetra.equals(asPalabras[iSeleccion][i])) {
                        iContadorBien++;
                        System.out.println(iContadorBien);
                    }
                }
                if (iContadorBien == iCantLetras) {
                    System.out.println("Ganaste");
                } else {
                    System.out.println("Perdiste");
                }
            } else {
                System.out.println("Perdiste");
            }

        } else {
            do {
                System.out.println("¿Que letra quieres buscar?");
                sEleccion = sInput.next().toLowerCase();
                for (int i = 0; i < asPalabras[iSeleccion].length; i++) {
                    if (asPalabras[iSeleccion][i] != null) {
                        if (sEleccion.equals(asPalabras[iSeleccion][i])) {
                            //System.out.print("[" + asPalabras[iSeleccion][i] + "]");
                            iContadorBien++;
                            asPalabrasBien[i] = asPalabras[iSeleccion][i];
                            bCondicion = true;
                        }
                        /*else{
                         asPalabrasBien[i]="";
                         }*/
                    }
                }
                for (int i = 0; i < asPalabras[iSeleccion].length; i++) {
                    if (asPalabras[iSeleccion][i] != null) {
                        System.out.print("[" + asPalabrasBien[i] + "]");
                    }
                }
                
                if (bCondicion == false) {
                    iContadorMal++;
                    System.out.println("No existe, Error: " + iContadorMal);
                }
                bCondicion = false;
                System.out.println("");
                if (iContadorMal == 3) {
                    System.out.println("Perdiste");
                    
                    break;
                }
            } while (iContadorBien < iCantLetras);
        }
        iContadorMal=0;
        System.out.println("¿Deseas jugar de nuevo? y/n");
        sEleccion2 = sInput.next().toLowerCase();
        if(sEleccion2.equals("y")){
            bCondicion2 = true;
        }
        
        }while(bCondicion2==true); 
    }

}
