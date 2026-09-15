import Exceptions.IncorrectPasswordException;
import Exceptions.InvalidAgeException;
import Exceptions.InvalidCpfException;
import Usuarios.UsuarioTitular;

public class Main {
    static void main() {
        try {
            UsuarioTitular usuarioTitular = new UsuarioTitular();
            usuarioTitular.login();
            usuarioTitular.exibirMenu();
            usuarioTitular.escolherOpcao();
        } catch (InvalidAgeException | InvalidCpfException | IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}