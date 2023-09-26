import java.util.List;

public class ValidarArchivo {
    public static boolean esCSVValido(List<String[]> contenidoCSV) {
        // Aquí puedes implementar tus reglas de validación del archivo CSV.
        // Por ejemplo, verificar que todas las filas tengan la misma cantidad de columnas.

        int numColumnas = contenidoCSV.get(0).length;
        for (String[] fila : contenidoCSV) {
            if (fila.length != numColumnas) {
                return false;
            }
        }

        return true;
    }
}
