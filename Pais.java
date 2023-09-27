import java.util.ArrayList;

/**
 * Representa un país.
 */
public class Pais {
    private int id;
    private ArrayList<Ubicacion> ubicaciones;

    /**
     * Obtiene el ID del país.
     *
     * @return El ID del país.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del país.
     *
     * @param id El nuevo ID del país.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de ubicaciones del país.
     *
     * @return La lista de ubicaciones del país.
     */
    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Establece la lista de ubicaciones del país.
     *
     * @param ubicaciones La nueva lista de ubicaciones del país.
     */
    public void setUbicaciones(ArrayList<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    /**
     * Constructor de la clase Pais.
     *
     * @param id El ID del país.
     */
    public Pais(int id) {
        this.id = id;
        this.ubicaciones = new ArrayList<>();
    }

    /**
     * Obtiene la lista de recintos del país (a implementar).
     *
     * @return La lista de recintos del país.
     */
    public Recinto[] getRecintos() {
        return null;
    }

    // Otros métodos, como getters y setters, para manipular la lista de
    // ubicaciones.
}
