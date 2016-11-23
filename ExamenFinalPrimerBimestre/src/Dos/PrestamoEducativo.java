/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author SALAS
 */
public class PrestamoEducativo extends Prestamo {

    private String nivel_estudio;
    private String nom_centr_estu;
    private Garante garante2;
    private Garante garante3;

    public PrestamoEducativo(String nom_bene, double sueldo, double monto_pres,
            double inte, int tiempo_anios, Garante gara1, String niv_estu, String nom_centr, Garante gara2,
            Garante gara3) {
        super(nom_bene, sueldo, monto_pres, inte, tiempo_anios, gara1);
        setNivel_estudio(niv_estu);
        setNom_centr_estu(nom_centr);
        setGarante2(gara2);
        setGarante3(gara3);
    }

    public void setNivel_estudio(String nivel_e) {
        nivel_estudio = nivel_e;
    }

    public void setNom_centr_estu(String nom_c_es) {
        nom_centr_estu = nom_c_es;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public void setGarante3(Garante g3) {
        garante3 = g3;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public String getNom_centr_estu() {
        return nom_centr_estu;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    @Override
    public String toString() {
        return String.format("Automovil: %s\nNivel Estudio: %s\nNombre centro Educatio: %s\n\nGARANTE 2:"
                + "\nNombre:%s\nApellido:%s\nSueldo:%.2f\n\nGARANTE 3:\nNombre:%s\nApellido:%s\nSueldo:%.2f", super.toString(), getNivel_estudio(), getNom_centr_estu(), getGarante2().getNombre(),
                getGarante2().getApellido(), getGarante2().getSueldo(), getGarante3().getNombre(),
                getGarante3().getApellido(), getGarante3().getSueldo());
    }

}
