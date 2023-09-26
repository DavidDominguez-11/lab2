import java.util.List;

public class Pais {
    private int id;
    private String nombre;
    private List<Ubicacion> ubicaciones;

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ubicaciones = new ArrayList<>();
    }

    // Otros métodos, como getters y setters, para manipular la lista de
    // ubicaciones.
}
