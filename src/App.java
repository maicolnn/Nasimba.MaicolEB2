/**
 * @author: Maicol Nasimba
 * @date: 09.sep.2023
 * @description: Examen Bimestral 2
 */
import Framework.AppException;
import MNUtility.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class App {
    public static final String MN_NOMBRE_COMPLETO = "Maicol Estuardo Nasimba Quinga";
    public static final String MN_CEDULA = "1754491494";
    /**
     * @param args
     * @throws AppException
     */
    public static void main(String[] args) throws AppException {
        System.out.println("\t- NOMBRE: "+MN_NOMBRE_COMPLETO);
        System.out.println("\t- CEDULA: "+MN_CEDULA);
        mnEnter();
        if (Ejecutar.mnInicar()) {
            String rutaArchivo = "src\\Archivos\\NasimbaMaicol.csv";
            Set<String> segmentos = leerArchivoCSV(rutaArchivo);
            // Imprimir los segmentos
            for (String segmento : segmentos) {
                System.out.print(segmento+"  ");

            }
            System.out.println("");
            Ejecutar.mnDatos();
            mnEnter();         
        } else {

            System.out.println("Intentos Agotados...");
        }
    }


      /**
     * Lee el archivo
     * @param rutaArchivo ruta
     * @return los segmentos del archivo
     */
    public static Set<String> leerArchivoCSV(String rutaArchivo) {
        Set<String> segmentos = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String primeraLinea = br.readLine();
            if (primeraLinea != null) {
                String[] segmentosArray = primeraLinea.split(";");
                for (String segmento : segmentosArray) {
                    segmentos.add(segmento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return segmentos;
    }

    public static void mnEnter() {
        System.out.println("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Espera a que el usuario presione Enter después de ingresar algo
    }
    
    
}



