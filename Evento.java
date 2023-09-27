import java.util.Date;

/**
 * Representa un evento.
 */
public class Evento {
    private int id;
    private int pais;
    private String artista;
    private int horario;
    private Date fecha;
    private int duracion;
    private int cantidadAsistentes;

    /**
     * Obtiene el ID del evento.
     *
     * @return El ID del evento.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del evento.
     *
     * @param id El nuevo ID del evento.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el país del evento.
     *
     * @return El ID del país del evento.
     */
    public int getPais() {
        return pais;
    }

    /**
     * Establece el país del evento.
     *
     * @param i El nuevo ID del país del evento.
     */
    public void setPais(int i) {
        this.pais = i;
    }

    /**
     * Obtiene el nombre del artista del evento.
     *
     * @return El nombre del artista del evento.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el nombre del artista del evento.
     *
     * @param artista El nuevo nombre del artista del evento.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene el horario del evento.
     *
     * @return El horario del evento.
     */
    public int getHorario() {
        return horario;
    }

    /**
     * Establece el horario del evento.
     *
     * @param horario El nuevo horario del evento.
     */
    public void setHorario(int horario) {
        this.horario = horario;
    }

    /**
     * Obtiene la fecha del evento.
     *
     * @return La fecha del evento.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del evento.
     *
     * @param fecha La nueva fecha del evento.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la duración del evento.
     *
     * @return La duración del evento.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración del evento.
     *
     * @param duracion La nueva duración del evento.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene la cantidad de asistentes al evento.
     *
     * @return La cantidad de asistentes al evento.
     */
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    /**
     * Establece la cantidad de asistentes al evento.
     *
     * @param cantidadAsistentes La nueva cantidad de asistentes al evento.
     */
    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Obtiene el nombre del evento (a implementar).
     *
     * @return El nombre del evento.
     */
    public String getNombre() {
        return null;
    }

    /**
     * Obtiene la ubicación del evento (a implementar).
     *
     * @return La ubicación del evento.
     */
    public Object getUbicacion() {
        return null;
    }
}
