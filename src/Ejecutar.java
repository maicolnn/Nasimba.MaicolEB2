import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import BusinessLogic.UsuarioBL;
import BusinessLogic.Entities.Usuario;
import Framework.AppException;
import MNUtility.Utility;

public class Ejecutar {
    private static final int MN_INTENTOS = 3;
    
    public static boolean mnInicar() {
        Scanner scanner = new Scanner(System.in);
        int intentos = MN_INTENTOS;

        while (intentos > 0) {
            System.out.println("\u001B[35mIngrese sus credenciales para iniciar el programa");
            System.out.println("----------------------------------");
            System.out.print("Usuario: ");
            String username = scanner.nextLine();

            System.out.print("Clave: ");
            String password = scanner.nextLine();
            System.out.println("----------------------------------");

            if (mnAutentificar(username, password)) {
                 Utility.clearScreen();

     
            System.out.println("\u001B[33m\t\t BIENVENIDO");
            System.out.println("Presione enter para continuar... ");
            scanner.nextLine();
            Utility.clearScreen();

                return true;
            } else {Utility.clearScreen();
                intentos--;
                System.out.println("Intento fallido. Intentos restantes: " + intentos);
                
            }
        }

        if (intentos == 0) {
            System.out.println("Agotaste los intentos. El programa se cerrará.");
        }

        return false;
    }
    private static boolean authenticate(String username, String password) throws AppException {
    
        UsuarioBL usuarioBL = new UsuarioBL();
        List<Usuario> usuarios = usuarioBL.getUsuario();

        for (Usuario usuario : usuarios) {
            if (usuario.getusuario().equals(username) && usuario.getclave().equals(password)) {
                return true; 
            }
        }
        return false;
    }
    private static boolean mnAutentificar(String username, String password) {
    
        return (username.equals("profe") && password.equals("1234")) ||
               (username.equals("maicol.nasimba@epn.edu.ec") && password.equals("1754491494")) ||
               (username.equals("profesor") && password.equals("contrasena3"));
    }


    
        public static void mnDatos()  {
        System.out.println("[+] Leyendo: \n"
                + "- CoordenadaTipo... \n"
                + "- Coordenadas... \n"
                + "- Arsenal... \n"
                + "- Horarios... \n");
        System.out.println("[+] Guardando: \n"
                + "- CoordenadaTipo... \n"
                + "- Coordenadas... \n"
                + "- Arsenal... \n"
                + "- Horarios...");

    }

}
