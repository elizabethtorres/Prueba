package Uno;

//Clase Alumno
public class Alumno {

    //declaracion de atributos
    private String nombre;
    private String apellido;

    //atributo de tipo Docente 
    private Docente docente_programacion;
    private Docente docente_base_datos;

    //Constructor de la Clase Alumno
    public Alumno(String nombre, String apellido, Docente doce_pro, Docente doc_datos) {
        setNombre(nombre);
        setApellido(apellido);
        setDocente_programacion(doce_pro);
        setDocente_base_datos(doc_datos);
    }

    //Los Set y los Get de la clase
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }

    public void setDocente_programacion(Docente doc_pro) {
        docente_programacion = doc_pro;
    }

    public void setDocente_base_datos(Docente doc_base_datos) {
        docente_base_datos = doc_base_datos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Docente getDocente_programacion() {
        return docente_programacion;
    }

    public Docente getDocente_base_datos() {
        return docente_base_datos;
    }

    //Un toString para amostrar
    @Override
    public String toString() {
        return String.format("\t\tAlumno:\nNombre: %s\nApellido: %s\n\nDOCENTE PROGRAMACION\n%s\nDOCENTE DE BASE DE DATOS\n%s",
                getNombre(), getApellido(), getDocente_programacion().getNombre(), getDocente_base_datos().getNombre());

        //retorna un String.format
    } // final del toString

} // Final de la Clase

