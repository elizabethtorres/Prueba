package Tres;

//clase madre vehiculos
public abstract class Vehiculos {

    //declarar los atributos propios de la clase
    private String matricula;
    private String color;
    private String marca;
    private int dias_alqui;

    //El constructor de esta clase 
    public Vehiculos(String mat, String co, String ma, int dias_a) {
        setMatricula(mat);
        setColor(co);
        setMarca(ma);
        setDias_alqui(dias_a);
    }

    //El set y get para cada atributo de la clase
    public void setMatricula(String m) {
        matricula = m;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setDias_alqui(int dias_a) {
        dias_alqui = dias_a;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getDias_alqui() {
        return dias_alqui;
    }

    //metodo para sacar la base de alquiler que requieren los vehiculos
    public double base_alquiler() {
        return (50 * dias_alqui);
    }

    //metodo abstracto para obtener el precio de alquiler
    public abstract double obtener_precio_alquiler();

    @Override
    
    //metodo toString 
    public String toString() {
      
        //retorna caracteristicas propias de la clase madre 
        return String.format("\t\tVehiculos \nMatricula: %s\nColor: %s\nMarca: %s\nDias alquiler: %d\n", getMatricula(), getColor(), getMarca(), getDias_alqui());
    }

}
