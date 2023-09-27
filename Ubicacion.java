import java.util.ArrayList;

/**
 * Representa una ubicación.
 */
public class Ubicacion {
    private String nombre_ubicacion;
    private ArrayList<Recinto> recintos;

    /**
     * Obtiene el nombre de la ubicación.
     *
     * @return El nombre de la ubicación.
     */
    public String getNombre_ubicacion() {
        return nombre_ubicacion;
    }

    /**
     * Establece el nombre de la ubicación.
     *
     * @param nombre_ubicacion El nuevo nombre de la ubicación.
     */
    public void setNombre_ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
    }

    /**
     * Obtiene la lista de recintos de la ubicación.
     *
     * @return La lista de recintos de la ubicación.
     */
    public ArrayList<Recinto> getRecintos() {
        return recintos;
    }

    /**
     * Establece la lista de recintos de la ubicación.
     *
     * @param recintos La nueva lista de recintos de la ubicación.
     */
    public void setRecintos(ArrayList<Recinto> recintos) {
        this.recintos = recintos;
    }

    /**
     * Constructor de la clase Ubicación.
     *
     * @param nombre_ubicacion El nombre de la ubicación.
     */
    public Ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
        this.recintos = new ArrayList<>();
    }

    /**
     * Agrega un recinto a la ubicación.
     *
     * @param recinto El recinto a agregar.
     */
    public void agregarRecinto(Recinto recinto) {
        recintos.add(recinto);
    }

    // Otros métodos relevantes para la clase Ubicación.
}
