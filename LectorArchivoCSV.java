import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LectorArchivoCSV {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

    public static List<Evento> cargarEventosDesdeCSV(String eventosCsvFile) {
        List<Evento> eventos = new ArrayList<>();

        try {
            BufferedReader eventosReader = new BufferedReader(new FileReader(eventosCsvFile));
            String eventosLine;
            while ((eventosLine = eventosReader.readLine()) != null) {
                String[] eventoData = eventosLine.split("\\|");

                Evento evento = new Evento();
                evento.setId(Integer.parseInt(eventoData[0]));
                evento.setPais(Integer.parseInt(eventoData[1]));
                evento.setArtista(eventoData[2]);
                evento.setHorario(Integer.parseInt(eventoData[3]));
                evento.setFecha(dateFormat.parse(eventoData[4]));
                evento.setDuracion(Integer.parseInt(eventoData[5]));
                evento.setCantidadAsistentes(Integer.parseInt(eventoData[6]));
                eventos.add(evento);
            }
            eventosReader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return eventos;
    }

    public static List<Pais> cargarRecintosDesdeCSV(String recintosCsvFile, List<Pais> paises) {
        try {
            BufferedReader recintosReader = new BufferedReader(new FileReader(recintosCsvFile));
            String recintosLine;
            while ((recintosLine = recintosReader.readLine()) != null) {
                String[] recintoData = recintosLine.split("\\|");

                Recinto recinto = new Recinto();
                recinto.setUbicacion(new Ubicacion(recintoData[1]));
                recinto.setId(Integer.parseInt(recintoData[2]));
                recinto.setCapacidad(Integer.parseInt(recintoData[3]));

                Pais paisExistente = null;
                for (Pais pais : paises) {
                    if (sucursal.getNombre().equals(nombreSucursal)) {
                        sucursalExistente = sucursal;
                        break;
                    }
                }
            }
            recintosReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recintos;
    }

    public void escribirCSV(List<String[]> contenidoCSV) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            for (String[] fila : contenidoCSV) {
                String filaCSV = String.join("|", fila);
                writer.write(filaCSV + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
