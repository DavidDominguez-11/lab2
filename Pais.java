import java.util.ArrayList;
import java.util.List;

public class Pais {
    private int id;
    private String nombre;
    private List<Ubicacion> ubicaciones;

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

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ubicaciones = new ArrayList<>();
    }

    // Otros métodos, como getters y setters, para manipular la lista de
    // ubicaciones.
}
