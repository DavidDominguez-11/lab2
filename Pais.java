import java.util.ArrayList;

public class Pais {
    private int id;
    private ArrayList<Ubicacion> ubicaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(ArrayList<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Pais(int id) {
        this.id = id;
        this.ubicaciones = new ArrayList<>();
    }

    // Otros métodos, como getters y setters, para manipular la lista de
    // ubicaciones.
}
