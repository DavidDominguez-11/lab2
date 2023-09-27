import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecintoManager {
    private List<Recinto> recintos;
    private List<Evento> eventosAsignados;
    private List<Evento> eventosNoAsignados;

    public RecintoManager(List<Recinto> recintos) {
        this.recintos = recintos;
        this.eventosAsignados = new ArrayList<>();
        this.eventosNoAsignados = new ArrayList<>();
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
            for (Evento evento : eventos) {
                if (recinto.getCapacidad() >= evento.getCantidadAsistentes()) {
                    recinto.asignarEventos(Collections.singletonList(evento));
                    eventosAsignados.add(evento);
                } else {
                    eventosNoAsignados.add(evento);
                }
            }
        }
    }

    public List<Evento> getEventosAsignados() {
        return eventosAsignados;
    }
    
    public List<Evento> getEventosNoAsignados() {
        return eventosNoAsignados;
    }
}
