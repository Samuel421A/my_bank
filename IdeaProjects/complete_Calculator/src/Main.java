import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE A SUA SENHA PARA ENTRAR: ");
        int password = scanner.nextInt();

        Calculator calculator = new Calculator();
        calculator.showMenu();
    }
}