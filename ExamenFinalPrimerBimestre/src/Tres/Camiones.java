package Tres;

//Clse camiones que se extiende de la clase madre vehiculos
public class Camiones extends Vehiculos {

    //declarar los atributos propios de la clase
    private int toneladas;

    //El constructor de esta clase mas os tributos de la clase madre
    public Camiones(int tone, String mat, String co, String ma, int dias_a) {
        super(mat, co, ma, dias_a);
        setToneladas(tone);

    }

    //El set y get para cada atributo de la clase
    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int t) {
        toneladas = t;
    }

    @Override

    //Metodo para obtener el precio de alquiler 
    
    public double obtener_precio_alquiler() {
        //retorna un valor que adquiere de la base de alquiler por las toneladas 
        return base_alquiler() + 20 * getToneladas();
    }

    @Override
    
    //metodo toSttring
    public String toString() {
        //va a retornar el toString de la clase madre mas lo ingresado en esta clase
        return String.format("\t\tCAMION\n%sToneladas", super.toString(), getToneladas());
    }
}
