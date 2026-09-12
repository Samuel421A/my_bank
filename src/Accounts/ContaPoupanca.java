package Accounts;

import java.util.Scanner;

public class ContaPoupanca extends ContaCorrente {
    private final Scanner scanner = new Scanner(System.in);

    public void investir() {
        double valorInvestimento;
        System.out.println("Quanto você quer investir?");
        valorInvestimento = scanner.nextInt();
    }

    public void resgatar() {
        double valorResgate;
        System.out.println("Quanto você quer resgatar?");
        valorResgate = scanner.nextInt();
    }
}
