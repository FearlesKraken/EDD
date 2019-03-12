/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_examen_diagnostico;

public class Principal {

    public static void main(String[] args) {
       Primo pNum = new Primo(45987);
       pNum.esPrimo();
       Primo pNum2 = new Primo();
       pNum2.setNumero(4);
       pNum2.esPrimo();
    }
    
}
class Primo{
    private int numero;

    public Primo() {
        
    }

    public Primo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void esPrimo(){
        String sCade = numero +" es primo";
        for (int i = 2; i < numero; i++) {
            if((numero % i) == 0){//NO ES PRIMO
                sCade = numero + " no es primo";
                break;
                
            }
        }
        System.out.println(sCade);
    }
}
/*
for -> Se usa cuando se sabe la cantidad de repeticiones
while -> Cuando no saben la cantidad de repeticiones --> cero o n
do while -> Cuando no saben la cantidad de repeticiones, pero, al menos necesitan ejecutarlo una vez
break rompe el ciclo
continue se brinca un ciclo
*/