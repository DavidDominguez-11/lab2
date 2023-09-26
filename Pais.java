import java.util.ArrayList;
import java.util.List;

public class Pais {
    private int id;
    private List<Ubicacion> ubicaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Pais(int id) {
        this.id = id;
        this.ubicaciones = new ArrayList<>();
    }

    // Otros métodos, como getters y setters, para manipular la lista de
    // ubicaciones.
}
