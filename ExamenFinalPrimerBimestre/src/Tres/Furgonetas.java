
package Tres;

//Clse furgonetas que se extiende de la clase madre vehiculos
public class Furgonetas extends Vehiculos {

    //El constructor de esta clase solo con los atributos de la clase madre
    public Furgonetas( String mat, String co, String ma, int dias_a) {
        super(mat, co, ma, dias_a);
    }

    @Override

    //Metodo para obtener el precio de alquiler 
    public double obtener_precio_alquiler() {
        //retorna un valor que adquiere de la base de alquiler mas 100 fijos
        return base_alquiler() + 100;
    }

    @Override
     //metodo toSttring
    public String toString() {
        //va a retornar el toString de la clase madre mas lo ingresado en esta clase
        return String.format("\t\tFURGONETAS\n%s", super.toString());
    }

}
