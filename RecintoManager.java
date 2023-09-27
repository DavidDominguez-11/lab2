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
            if (recinto.getIdPais() == pais.getId()) {
                recintosEnPais.add(recinto);
            }
        }
        
        return recintosEnPais;
    }

    private void asignarEventosEnRecintos(List<Recinto> recintos, List<Evento> eventos) {
        for (Recinto recinto : recintos) {
            for (Evento evento : eventos) {
                // Verificar si el país del evento coincide con el país del recinto
                if (evento.getPais() == recinto.getPais()) {
                    // Verificar si la ubicación del evento coincide con la ubicación del recinto
                    if (evento.getUbicacion().equals(recinto.getUbicacion())) {
                        // Verificar si el recinto tiene capacidad suficiente
                        if (recinto.getCapacidad() >= evento.getCantidadAsistentes()) {
                            // Verificar si el recinto tiene eventos previos
                            boolean hayConflicto = false;
                            for (Evento eventoExistente : recinto.getEventos()) {
                                if (hayConflicto(eventoExistente, evento)) {
                                    hayConflicto = true;
                                    break; // Hay un conflicto, salir del bucle
                                }
                            }
                            
                            if (!hayConflicto) {
                                // No hay conflictos, agregar el evento
                                recinto.asignarEventos(Collections.singletonList(evento));
                                eventosAsignados.add(evento);
                            } else {
                                eventosNoAsignados.add(evento);
                            }
                        } else {
                            eventosNoAsignados.add(evento);
                        }
                    } else {
                        eventosNoAsignados.add(evento);
                    }
                } else {
                    eventosNoAsignados.add(evento);
                }
            }
        }
    }
    private boolean hayConflicto(Evento eventoExistente, Evento nuevoEvento) {
        int horaInicioExistente = eventoExistente.getHorario();
        int horaFinExistente = horaInicioExistente + eventoExistente.getDuracion();
    
        int horaInicioNuevo = nuevoEvento.getHorario();
        int horaFinNuevo = horaInicioNuevo + nuevoEvento.getDuracion();
    
        // Verificar si los eventos se superponen
        if (horaInicioExistente <= horaFinNuevo && horaFinExistente >= horaInicioNuevo) {
            return true; // Hay conflicto de horario
        }
    
        return false; // No hay conflicto de horario
    }

    public List<Evento> getEventosAsignados() {
        return eventosAsignados;
    }
    
    public List<Evento> getEventosNoAsignados() {
        return eventosNoAsignados;
    }
}
