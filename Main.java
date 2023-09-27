import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pais> paises = new ArrayList<Pais>();
        String path = "evento.csv";
        LectorArchivoCSV.cargarRecintosDesdeCSV("recinto.csv", paises);
        // Crear algunos objetos de ejemplo
        String ubicacion1 = "Ubicación 1";
        Recinto recinto1 = new Recinto(1, ubicacion1, 1000);

        // Asignar el evento al recinto
        // recinto1.agregarEvento(evento1); este ya no es el metodo
        ArrayList<Evento> eventos = LectorArchivoCSV.cargarEventosDesdeCSV(path);
        recinto1.asignarEventos(eventos);

        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al sistema de asignación de eventos");
            System.out.println("1. Mostrar eventos en recinto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del recinto: ");
                    int idRecinto = scanner.nextInt();

                    // Buscar el recinto por su ID
                    Recinto recintoSeleccionado = buscarRecintoPorID(idRecinto, paises);

                    if (recintoSeleccionado != null) {
                        // Mostrar los eventos en el recinto
                        List<Evento> eventosEnRecinto = recintoSeleccionado.getEventos();
                        
                        if (!eventosEnRecinto.isEmpty()) {
                            System.out.println("Eventos en el recinto " + recintoSeleccionado.getId() + " - " + recintoSeleccionado.getUbicacion() + ":");
                            for (Evento evento : eventosEnRecinto) {
                                System.out.println("ID: " + evento.getId());
                                System.out.println("Nombre: " + evento.getNombre());
                                System.out.println("Fecha: " + evento.getFecha());
                                System.out.println("Asistentes: " + evento.getCantidadAsistentes());
                                System.out.println("-----------------------------");
                            }
                        } else {
                            System.out.println("No hay eventos asignados en el recinto " + recintoSeleccionado.getId());
                        }
                    } else {
                        System.out.println("Recinto no encontrado. Verifique el ID ingresado.");
                    }
                    break;

                    // Aquí puedes buscar el recinto por su ID y mostrar sus eventos
                    // Puedes implementar esta lógica utilizando las clases y métodos adecuados
                    // Por ejemplo, puedes iterar sobre los eventos del recinto y mostrar sus
                    // detalles.
                case 2:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        
    }

    private static Recinto buscarRecintoPorID(int idRecinto, List<Pais> paises) {
        for (Pais pais : paises) {
            for (Recinto recinto : pais.getRecintos()) {
                if (recinto.getId() == idRecinto) {
                    return recinto;
                }
            }
        }
        return null; // Retorna null si el recinto no se encuentra
    }
    
}
