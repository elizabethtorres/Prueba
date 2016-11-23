package Tres;

//Clse coches que se extiende de la clase madre vehiculos
public class Coches extends Vehiculos {

    //declarar los atributos propios de la clase
    private int num_pasajeros;

    //El constructor de esta clase mas os tributos de la clase madre
    public Coches(int num_pasa, String mat, String co, String ma, int dias_a) {
        super(mat, co, ma, dias_a);
        setNum_pasajeros(num_pasa);

    }

    //El set y get para cada atributo de la clase
    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num) {
        num_pasajeros = num;
    }

    @Override
    
    //Metodo para obtener el precio de alquiler 
    public double obtener_precio_alquiler() {
        //retorna un valor que adquiere de la base de alquiler por el numero de pasajeros
        return base_alquiler() + 5 * getNum_pasajeros();
    }

    @Override
     //metodo toSttring
    public String toString() {
        //va a retornar el toString de la clase madre mas lo ingresado en esta clase
        return String.format("\t\tCOCHES\n%sNumero de Pasajeros %s", super.toString(), getNum_pasajeros());
    }

}
