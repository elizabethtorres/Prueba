package Tres;

//Clse microbuses que se extiende de la clase madre vehiculos
public class Microbuses extends Vehiculos {

    //declarar los atributos propios de la clase
    private int Num_rutas_diarias;

    //El constructor de esta clase mas os tributos de la clase madre
    public Microbuses(int num_ruta, String mat, String co, String ma, int dias_a) {
        super(mat, co, ma, dias_a);
        setNum_rutas_diarias(num_ruta);

    }

    //El set y get para cada atributo de la clase
    public int getNum_rutas_diarias() {
        return Num_rutas_diarias;
    }

    public void setNum_rutas_diarias(int Num_ru) {
        Num_rutas_diarias = Num_ru;
    }

    
    @Override
    //Metodo para obtener el precio de el alquiler de cada clase de vehiculos
    public double obtener_precio_alquiler() {
        //retorna un valor que adquiere de la base de alquiler por el numero de rutas
        return base_alquiler() + 10 * getNum_rutas_diarias();
    }

    @Override
     //metodo toSttring
    public String toString() {
        //va a retornar el toString de la clase madre mas lo ingresado en esta clase
        return String.format("\t\tMICROBUSES\n%sBumero de Rutas Diarias %d", super.toString(), getNum_rutas_diarias());
    }
}
