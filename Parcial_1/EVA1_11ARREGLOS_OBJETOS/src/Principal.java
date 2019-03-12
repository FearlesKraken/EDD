
import javax.swing.JOptionPane;

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
        Persona[] apDatos = new Persona[1];
        
        for (int i = 0; i < apDatos.length; i++) {
            apDatos[i] = new Persona();
            String capturaString =JOptionPane.showInputDialog("Introduce nombre de la persona: ");
            apDatos[i].setNombre(capturaString);
            int capturaint =Integer.parseInt(JOptionPane.showInputDialog("Introduce edad de la persona: "));
            apDatos[i].setEdad(capturaint);
            capturaString =JOptionPane.showInputDialog("Introduce apellido de la persona: ");
            apDatos[i].setApellido(capturaString);
            capturaString =JOptionPane.showInputDialog("Introduce nacionalidad de la persona: ");
            apDatos[i].setNacionalidad(capturaString);
            
        }
        for (int i = 0; i < apDatos.length; i++) {
            JOptionPane.showMessageDialog(null, "Datos de la persona\nNombre completo: "+apDatos[i].getNombre() + " " + apDatos[i].getApellido() + "\nEdad: " + apDatos[i].getEdad() + "\nNacionalidad: " + apDatos[i].getNacionalidad());
        }
        
    }
}
    class Persona{
        private String nombre,nacionalidad,apellido;
        private int edad;
        
        public Persona(){
            nombre = "Ruben";
            apellido = "Hernandez";
            edad = 37;
            nacionalidad = "Mexicano";
        }
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(String nombre, String nacionalidad, String apellido, int edad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
            this.apellido = apellido;
            this.edad = edad;
        }
        //Error NullPointerException es que estoy tratando de usar un objeto jamas creado
    }

