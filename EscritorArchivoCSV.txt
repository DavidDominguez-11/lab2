import java.util.ArrayList;
import java.util.List;

public class EscritorArchivoCSV {
    private String rutaArchivo;

    public EscritorArchivoCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void agregarFilaCSV(String[] nuevaFila) {
        LectorArchivoCSV lector = new LectorArchivoCSV(rutaArchivo);
        List<String[]> contenidoCSV = lector.leerCSV();

        contenidoCSV.add(nuevaFila);

        lector.escribirCSV(contenidoCSV);
    }
}