
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
public class Principal_1 {
    
        public static void main(String[] args) {
            Scanner iInput = new Scanner(System.in);
            System.out.println("Introduce un numero entero no negativo");
            int iNum = iInput.nextInt();
            System.out.println("Sumatoria: " + sumaDigitos(iNum));
        }
        public static int sumaDigitos(int numero){
            int iMenos = numero%10;
            int iMas = numero/10;
            if(iMas>0){
            return iMenos + sumaDigitos(iMas);
            }else{
                return iMenos;
            }
            }
        }

