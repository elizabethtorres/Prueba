
package Dos;

//clase Garante clase madre
public class Garante {

    //declaracion de atributos que seran heredados
    private String nombre;
    private String apellido;
    private double sueldo;

    //el constructor de la clase
    public Garante(String n, String a, double sueldo) {
        setNombre(n);
        setApellido(a);
        setSueldo(sueldo);
    }

    //los set y los get de la clase
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setApellido(String ape) {
        apellido = ape;
    }

    public void setSueldo(double suel) {
        sueldo = suel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }
}
