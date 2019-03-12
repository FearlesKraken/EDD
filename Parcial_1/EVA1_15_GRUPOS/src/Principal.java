
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
        //Clase alumnos (nombre, edad)
        //Preguntar la cantidad de grupos
        //Para grupo preguntar la cantidad de alumnos
        //Para cada alumno, llenar los datos
        int cantidadalum;
        int cantidadgrup = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de grupos"));
        alumnos[][] arAlumno = new alumnos[cantidadgrup][];
        int contador=1;
        
        for (int i = 0; i < arAlumno.length; i++) {
            cantidadalum = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de alumnos del grupo " + contador));
            contador++;
            arAlumno[i] = new alumnos[cantidadalum];
            
        }
        
        for (int i = 0; i < arAlumno.length; i++) {
            
            for (int j = 0; j < arAlumno[i].length; j++) {
                arAlumno[i][j] = new alumnos();
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del alumno: " + j + " Del grupo: " + i));
                arAlumno[i][j].setEdad(edad);
                String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno: " + j + " Del grupo: " + i);
                arAlumno[i][j].setNombre(nombre);
                
            }
            
        }
        for (int i = 0; i < arAlumno.length; i++) {
           
            for (int j = 0; j < arAlumno[i].length; j++) {
                //getter
                System.out.println("Datos del alumno " + j + " Del grupo: " + i);
                
                System.out.println("Nombre: " + arAlumno[i][j].getNombre());
                System.out.println("Edad: " + arAlumno[i][j].getEdad());
            }
    }
    
}
}
class alumnos{
            int edad;
            String nombre;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

            
    public alumnos(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
            
    public alumnos(){
        edad=15;
        nombre="Jorge";
    }
    
        }
