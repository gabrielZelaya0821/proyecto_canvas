package modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Maestro extends Usuario {

    private int id;
    private String nombre;
    private String profesion;
    private double sueldo;
    private ArrayList<Clase> clases = new ArrayList<>();

    public Maestro() {
        super();
    }

    public Maestro(int id, String nombre, String profesion, double sueldo, String user, String password, String role) {
        super(user, password, role);
        this.id = id;
        this.nombre = nombre;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getClases() {
        if (clases.isEmpty()) {
            return "No se han asignado clases";
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

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public String mostrar(){
        return id + "|" + nombre + "|" + profesion + "|" + sueldo + "|" + getClases();
    }
    
    @Override
    public String toString() {
        return id + "|" + nombre;
    }

}
