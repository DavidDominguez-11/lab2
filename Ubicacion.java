import java.util.ArrayList;
import java.util.List;

public class Ubicacion {
    private String nombre_ubicacion;
    private List<Recinto> recintos;
    

    public Ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
        // Inicializa las listas de recintos y eventos
        this.recintos = new ArrayList<>();
    }

    public void agregarRecinto(Recinto recinto) {
        recintos.add(recinto);
    }

    

    // Otros métodos relevantes para la clase Ubicacion
}
