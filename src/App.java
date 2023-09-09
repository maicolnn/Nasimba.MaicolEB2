/**
 * @author: Maicol Nasimba
 * @date: 09.sep.2023
 * @description: Examen Bimestral 2
 */
import Framework.AppException;
import MNUtility.Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import BusinessLogic.UsuarioBL;
import BusinessLogic.Entities.Usuario;

public class App {
    public static final String MN_NOMBRE_COMPLETO = "Maicol Estuardo Nasimba Quinga";
    public static final String MN_CEDULA = "1754491494";
    /**
     * @param args
     * @throws AppException
     */
    public static void main(String[] args) throws AppException {
        if (LoginM.mnInicar()) {
            String rutaArchivo = "src\\Archivos\\NasimbaMaicol.csv";
            Set<String> segmentos = leerArchivoCSV(rutaArchivo);

            // Imprimir los segmentos
            for (String segmento : segmentos) {
                System.out.print(segmento+"  ");

            }
            System.out.println("");
        } else {

            System.out.println("Intentos Agotados...");
        }
    }

       /**
     * Obtiene la ruta del archivo
     * @param nombreArchivo Nombre del archivo
     * @return La ruta del archivo
     */
    public static String mnObtenerRuta(String nombreArchivo) {
        String rutaRelativa = "src\\Archivos\\NasimbaMaicol.csv";
        File archivo = new File(rutaRelativa, nombreArchivo);
        return archivo.getPath();
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

    /**
     * @param rutaArchivo: Ruta del archivo
     * @return Nombre del archivo
     */
    public static String mnObtenerNombreArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        String nombreCompleto = archivo.getName();
        int indicePunto = nombreCompleto.lastIndexOf(".");
        if (indicePunto != -1) {
            return nombreCompleto.substring(0, indicePunto);
        }
        
        return nombreCompleto;
    }
}



