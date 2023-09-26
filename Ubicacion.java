import java.util.ArrayList;
import java.util.List;

public class Ubicacion {
    private String nombre_ubicacion;
    private List<Recinto> recintos;
    private List<Evento> eventos;

    public Ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
        // Inicializa las listas de recintos y eventos
        this.recintos = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarRecinto(Recinto recinto) {
        recintos.add(recinto);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Otros métodos relevantes para la clase Ubicacion
}
