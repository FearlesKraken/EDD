/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_stack;

/**
 *
 * @author invitado
 */
public class EVA1_4_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inicia main");
        a();
        System.out.println("Apagar reactor");
    }
    public static void a()
    {
        System.out.println("inicia A");
        b();
        System.out.println("fin A");
       
    }
    public static void b()
    {
        System.out.println("inicia B");
        c();
        System.out.println("fin B");
       
    }
    public static void c()
    {
        System.out.println("inicia C");
        
        System.out.println("fin C");
       
    }
}
