import java.util.ArrayList;
import java.util.List;

public class Recinto {
    private int id;
    private String ubicacion;
    private int capacidad;
    private List<Evento> eventos;
    private int idPais;

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

    public Recinto(int id, String ubicacion, int capacidad, int idPais) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.idPais = idPais;
        this.eventos = new ArrayList<>();
    }

    public Recinto() {
    }

    public void asignarEventos(List<Evento> eventos) {
        for (Evento evento : eventos) {
            // verificar si el recinto tiene capacidad para el evento
            if (this.capacidad >= evento.getCantidadAsistentes()) {

                // se agrega
                this.eventos.add(evento);

                // cctualizar la capacidad del recinto
                this.capacidad -= evento.getCantidadAsistentes();
                System.out.println("Evento '" + evento.getId() + "' asignado al recinto " + this.id);
            } else {
                System.out.println("No hay capacidad suficiente en el recinto " + this.id + " para el evento '"
                        + evento.getId() + "'");
            }
        }
    }
    private int pais;

    public int getPais() {
        return pais;
    }

    public void setPais(int i) {
        this.pais = i;
    }

    // Otros métodos, como getters y setters.
}
