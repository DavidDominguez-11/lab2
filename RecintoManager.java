import java.util.ArrayList;
import java.util.List;

public class RecintoManager {
    private List<Recinto> recintos; // Debes proporcionar una lista de recintos disponibles.

    public RecintoManager(List<Recinto> recintos) {
        this.recintos = recintos;
    }

    public void asignarEventosEnPaises(List<Pais> paises, List<Evento> eventos) {
        for (Pais pais : paises) {
            List<Recinto> recintosEnPais = obtenerRecintosEnPais(pais);
            asignarEventosEnRecintos(recintosEnPais, eventos);
        }
    }

    private List<Recinto> obtenerRecintosEnPais(Pais pais) {
        List<Recinto> recintosEnPais = new ArrayList<>();
        
        for (Recinto recinto : recintos) {
            if (recinto.getPais().equals(pais)) {
                recintosEnPais.add(recinto);
            }
        }
        
        return recintosEnPais;
    }

    private void asignarEventosEnRecintos(List<Recinto> recintos, List<Evento> eventos) {
        for (Recinto recinto : recintos) {
            recinto.asignarEventos(eventos);
        }
    }
}
