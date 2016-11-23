
package Dos;

//clase Prestamo otra clase madre
public class Prestamo {

    //declaracion de los atributos de la clase
    private String nombredebenefiario;
    private double sueldo;
    private double montodeprestamo;
    private double interes;
    private int tiempo_pres_anios;
    private Garante garante1; //atributo de la clase Garante

    //constructor de la clase cpn los atributos de ella
    public Prestamo(String nom_bene, double sueldo, double monto_pres,
            double inte, int tiempo_anios, Garante gara1) {
        setNombredebenefiario(nom_bene);
        setSueldo(sueldo);
        setMontodeprestamo(monto_pres);
        setInteres(inte);
        setTiempo_pres_anios(tiempo_anios);
        setGarante1(gara1);
    }
    //los get y los set de cada atributo

    public void setNombredebenefiario(String nombre_benefiario) {
        nombredebenefiario = nombre_benefiario;
    }

    public void setSueldo(double suel) {
        sueldo = suel;
    }

    public void setMontodeprestamo(double m_prestamo) {
        montodeprestamo = m_prestamo;
    }

    public void setInteres(double in) {
        interes = in;
    }

    public void setTiempo_pres_anios(int tie_anios) {
        tiempo_pres_anios = tie_anios;
    }

    public void setGarante1(Garante g1) {
        garante1 = g1;
    }

    public String getNombredebenefiario() {
        return nombredebenefiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getMontodeprestamo() {
        return montodeprestamo;
    }

    public double getInteres() {
        return interes;
    }

    public int getTiempo_pres_anios() {
        return tiempo_pres_anios;
    }

    public Garante getGarante1() {
        return garante1;
    }

    //metodo para sacar el valor del prestamo 
    public double valor_total_prestamo(double montodeprestamo, double interes) {
        double valor_p = montodeprestamo * interes; 
        double valor_t = montodeprestamo + valor_p;
        return valor_t; // me retorna el valor total

    }

    @Override
    
    //el toString 
    public String toString() {
        
        //retorna los get de los atributos que queremos que salga
        return String.format("Beneficiario: %s\nSueldo:%.2f\nMonto del Prestamo: %.2f\nInteres: %.2f\nTiempo Prestamo(años): %d\n\nGarante 1:\nNombre: %s\nApellido: %s\nSueldo: %f\nValor Final Prestamo (interes incluido): %.2f\n",
                getNombredebenefiario(), getSueldo(), getMontodeprestamo(), getInteres(), getTiempo_pres_anios(), getGarante1().getNombre(), getGarante1().getApellido(), getGarante1().getSueldo(), valor_total_prestamo(montodeprestamo, interes));
    }
}


