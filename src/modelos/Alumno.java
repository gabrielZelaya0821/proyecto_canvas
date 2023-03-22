package modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Alumno extends Usuario {

    private int cuenta;
    private String nombre;
    private String carrera;
    private ArrayList<Clase> clases = new ArrayList<>();

    public Alumno() {
        super();
    }

    public Alumno(int cuenta, String nombre, String carrera, String user, String password, String role) {
        super(user, password, role);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClases() {
        if (clases.isEmpty()) {
            return "No se han matriculado clases";
        } else {
            String lista = "";
            for (Clase clase : clases) {
                if (clases.indexOf(clase) == clases.size() - 1) {
                    lista += clase;
                } else {
                    lista += clase + ",";
                }
            }
            return lista;
        }
    }
    
    public ArrayList<Clase> getClasesList(){
        return clases;
    }

    public void setClases(ArrayList<Clase> clasesCursadas) {
        this.clases = clasesCursadas;
    }
    
    public String mostrar(){
        return cuenta + "|" + nombre + "|" + carrera + "|" + getClases();
    }

    @Override
    public String toString() {
        return cuenta + "|" + nombre;
    }

}
