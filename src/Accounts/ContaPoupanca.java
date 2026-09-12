package Accounts;

import Exceptions.DeniedWithdrawalException;

import java.util.Scanner;

public class ContaPoupanca extends ContaCorrente {
    private final Scanner scanner = new Scanner(System.in);

    public void investir() {
        saldo = 1700;
        double valorInvestimento;
        System.out.println("Quanto você quer investir?");
        valorInvestimento = scanner.nextInt();
        saldo = saldo + valorInvestimento;
        System.out.println("Você investiu R$" + valorInvestimento + " e seu saldo atual é R$" + saldo);
    }

    public void resgatar() {
        double valorResgate;
        System.out.println("Quanto você quer resgatar?");
        valorResgate = scanner.nextInt();

        if(valorResgate > saldo) {
            throw new DeniedWithdrawalException("ERRO! VOCÊ NÃO TEM SALDO " +
                    "SUFICIENTE PARA RESGATAR ESSE VALOR"); //withdrawal significa saldo
        }
        saldo = saldo - valorResgate;
        System.out.println("Você resgatou R$" + valorResgate + " e seu saldo atual é R$" + saldo);
    }
}
