import java.util.Scanner;
import java.util.List;
import BusinessLogic.UsuarioBL;
import BusinessLogic.Entities.Usuario;
import Framework.AppException;

public class Login {
    private static final int MAX_INTENTOS = 3;

    public static boolean realizarInicioSesion() throws AppException {
        Scanner scanner = new Scanner(System.in);
        int intentos = MAX_INTENTOS;

        while (intentos > 0) {
            System.out.print("Usuario: ");
            String username = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            if (authenticate(username, password)) {
                System.out.println("Inicio de sesión exitoso");
                scanner.close();
                return true;
            } else {
                intentos--;
                System.out.println("Inicio de sesión fallido. Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Agotaste los intentos. El programa se cerrará.");
        }

        scanner.close();
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
}

