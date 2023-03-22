package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Clase implements Serializable{

    private String id;
    private String nombre;
    private String hora;
    private int uv;
    private String periodo;
    private int año;
    private Maestro maestro;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Examen> examenes = new ArrayList<>();
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public Clase() {
    }

    public Clase(String id, String nombre, String hora, int uv, String periodo, int año, Maestro maestro) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.uv = uv;
        this.periodo = periodo;
        this.año = año;
        this.maestro = maestro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public ArrayList<Alumno> getAlumnosList(){
        return alumnos;
    }
    
    public String getAlumnos() {        
        String lista = "";
        if(alumnos.isEmpty()){
            return "No se han matriculado alumnos";
        }else{
            for (Alumno alumno : alumnos) {
                if (alumnos.indexOf(alumno) == alumnos.size() - 1) {
                    lista += alumno;
                } else {
                    lista += alumno + ",";
                }
            }
            return lista;
        }
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Examen> getExamen() {
        return examenes;
    }

    public void setExamen(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public String mostrar(){
        return id + "|" + nombre + "|" +uv + "|" + maestro + "|" + getAlumnos();
    }
    
    @Override
    public String toString() {
        return id + "|" + nombre;
    }

}
