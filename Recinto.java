import java.util.List;

public class Recinto {
    private int id;
    private Ubicacion ubicacion;
    private int capacidad;
    private List<Evento> eventos;

    public Recinto(int id, Ubicacion ubicacion, int capacidad) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Otros métodos, como getters y setters.
}
