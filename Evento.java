import java.util.Date;

public class Evento {
    private int id;
    private int pais;
    private String artista;
    private int horario;
    private Date fecha;
    private int duracion;
    private int cantidadAsistentes;
    private String nombre;

    // construcotr
    public Evento(int id, int pais, String artista, int horario, Date fecha, int duracion, int cantidadAsistentes, String nombre) {
        this.id = id;
        this.pais = pais;
        this.artista = artista;
        this.horario = horario;
        this.fecha = fecha;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
        this.nombre = nombre;
    }

    // Constructor, getters y setters
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

    public int getPais() {
        return pais;
    }

    public void setPais(int i) {
        this.pais = i;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

}
