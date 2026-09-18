public class Calculator {
    public void showMenu() {
        System.out.println("----------------------------------");
        System.out.println("BEM-VINDO(A) AO APP DA CALCULADORA");
        System.out.println("----------------------------------");
        System.out.println("[1] SOMA");
        System.out.println("[2] SUBTRAÇÃO");
        System.out.println("[3] MULTIPLICAÇÃO");
        System.out.println("[4] DIVISÃO");
        System.out.println("[5] EXPONENCIAÇÃO");
        System.out.println("[6] RAIZ QUADRADA");
        System.out.println("[7] SAIR");
    }

    private int correctPassword = 32959;

    public void login(int password) {
        if (password != correctPassword) {
            System.out.println("SENHA INCORRETA");
        }
    }
}
