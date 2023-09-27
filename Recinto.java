import java.util.ArrayList;
import java.util.List;

/**
 * Representa un recinto.
 */
public class Recinto {
    private int id;
    private String ubicacion;
    private int capacidad;
    private List<Evento> eventos;
    private int idPais;

    /**
     * Obtiene el ID del país al que pertenece el recinto.
     *
     * @return El ID del país.
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Establece el ID del país al que pertenece el recinto.
     *
     * @param idPais El nuevo ID del país.
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    /**
     * Obtiene el ID del recinto.
     *
     * @return El ID del recinto.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del recinto.
     *
     * @param id El nuevo ID del recinto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la ubicación del recinto.
     *
     * @return La ubicación del recinto.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del recinto.
     *
     * @param ubicacion La nueva ubicación del recinto.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene la capacidad del recinto.
     *
     * @return La capacidad del recinto.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad del recinto.
     *
     * @param capacidad La nueva capacidad del recinto.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene la lista de eventos del recinto.
     *
     * @return La lista de eventos del recinto.
     */
    public List<Evento> getEventos() {
        return eventos;
    }

    /**
     * Establece la lista de eventos del recinto.
     *
     * @param eventos La nueva lista de eventos del recinto.
     */
    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    /**
     * Constructor de la clase Recinto.
     *
     * @param id        El ID del recinto.
     * @param ubicacion La ubicación del recinto.
     * @param capacidad La capacidad del recinto.
     * @param idPais    El ID del país al que pertenece el recinto.
     */
    public Recinto(int id, String ubicacion, int capacidad, int idPais) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.idPais = idPais;
        this.eventos = new ArrayList<>();
    }

    /**
     * Constructor vacío de la clase Recinto.
     */
    public Recinto() {
    }

    /**
     * Asigna eventos al recinto.
     *
     * @param eventos La lista de eventos a asignar al recinto.
     */
    public void asignarEventos(List<Evento> eventos) {
        for (Evento evento : eventos) {
            // verificar si el recinto tiene capacidad para el evento
            if (this.capacidad >= evento.getCantidadAsistentes()) {

                // se agrega
                this.eventos.add(evento);

                // actualizar la capacidad del recinto
                this.capacidad -= evento.getCantidadAsistentes();
                System.out.println("Evento '" + evento.getId() + "' asignado al recinto " + this.id);
            } else {
                System.out.println("No hay capacidad suficiente en el recinto " + this.id + " para el evento '"
                        + evento.getId() + "'");
            }
        }
    }
}
