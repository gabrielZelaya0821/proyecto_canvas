package modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Tarea {
    private Clase clase;
    private String descripcion;
    private Date fecha;
    private String nombre;
    private File file;
    private long espacio;
    private int nota;
    boolean yaSeHizo = false;
    
    
    public Tarea() {
    }

    public Tarea(Clase clase, String nombre,Date fecha,String descripcion) {
        this.clase = clase;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public boolean isYaSeHizo() {
        return yaSeHizo;
    }

    public void setYaSeHizo(boolean yaSeHizo) {
        this.yaSeHizo = yaSeHizo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public long getEspacio() {
        return espacio;
    }

    public void setEspacio(long espacio) {
        this.espacio = espacio;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre + "|Fecha de entrega: " + fecha.toString();
    }
    
    
}
