import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        String path = "evento.csv"; 
        // Crear algunos objetos de ejemplo
        String ubicacion1 = "Ubicación 1";
        Recinto recinto1 = new Recinto(1, ubicacion1, 1000);

        // aqui ahora hay que pasarlo como parametros
        Evento evento1 = new Evento();
        evento1.setId(1);
        evento1.setPais(1);
        evento1.setArtista("Artista 1");
        evento1.setHorario(1800); // Ejemplo de horario en formato militar (18:00)
        evento1.setFecha(new Date());
        evento1.setDuracion(120); // Duración en minutos
        evento1.setCantidadAsistentes(500);

        // Asignar el evento al recinto
        // recinto1.agregarEvento(evento1); este ya no es el metodo
        List<Evento> eventos = LectorArchivoCSV.cargarEventosDesdeCSV(path);
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

                    // Aquí puedes buscar el recinto por su ID y mostrar sus eventos
                    // Puedes implementar esta lógica utilizando las clases y métodos adecuados
                    // Por ejemplo, puedes iterar sobre los eventos del recinto y mostrar sus
                    // detalles.

                    break;
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
}
