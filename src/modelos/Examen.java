package modelos;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Examen {

    private Clase clase;
    private Date fecha;
    private LocalTime duracion;

    public Examen() {
    }

    public Examen(Clase clase, Date fecha, LocalTime duracion) {
        this.clase = clase;
        this.fecha = fecha;
        this.duracion = duracion;
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

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return clase.getId()+":"+clase.getNombre() + " examen|" + fecha + "|" + duracion;
    }

}
