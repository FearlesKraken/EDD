
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
public class Principal_3 {

    public static void main(String[] args) {
        Scanner iInput = new Scanner(System.in);
        int iBase,iPotencia;
        do {
            System.out.println("Los datos deben ser iguales o mayores a 1");
            System.out.println("Ingrese la base: ");
            iBase = iInput.nextInt();
            System.out.println("Ingrese la potencia: ");
            iPotencia = iInput.nextInt();
            if ((iBase < 1) || (iPotencia < 1)) {
                System.out.println("Valores no admitidos, intentalo de nuevo");
            }
        } while ((iBase < 1) || (iPotencia < 1));
        System.out.println("El resultado es: " + recursividad(iBase, iPotencia));
    }

    public static int recursividad(int iBase, int iPotencia) {

        if (iPotencia >= 1) {
            return iBase * recursividad(iBase, iPotencia - 1);
        }
        return 1;
    }
}
