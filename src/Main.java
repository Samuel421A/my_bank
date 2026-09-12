import Exceptions.InvalidAgeException;
import Exceptions.InvalidCPFException;
import Usuarios.UsuarioTitular;

public class Main {
    static void main() {
        try {
            UsuarioTitular usuarioTitular = new UsuarioTitular();
            usuarioTitular.fazerCadastro();
        } catch (InvalidAgeException | InvalidCPFException e) {
            System.out.println(e.getMessage());
        }
    }
}