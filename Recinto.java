import java.util.ArrayList;
import java.util.List;

public class Recinto {
    private int id;
    private String ubicacion;
    private int capacidad;
    private List<Evento> eventos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Recinto(int id, String ubicacion, int capacidad) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.eventos = new ArrayList<>();
    }

    public Recinto() {
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Otros métodos, como getters y setters.
}
