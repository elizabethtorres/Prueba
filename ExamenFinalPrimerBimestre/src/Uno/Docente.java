package Uno;

//Clase Docente
public class Docente {

    //declaracion de atributos
    private String nombre;
    private String apellido;
    private String titulo;

    //Metodo de la Clase Docente cn los atributos ingresados
    public Docente(String n, String ape, String tit) {
        setNombre(n);
        setApellido(ape);
        setTitulo(tit);
    }

    //Los Set y Get de los atributos
    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    //Un toString para presentar la maner a imprimir
    @Override
    public String toString() {

        return String.format("\nNombre: %s\nApellido: %s\nTitulo: %s\n", getNombre(), getApellido(), getTitulo());

    }
}
