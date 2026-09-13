package Accounts;

import Exceptions.DeniedWithdrawalException;
import Exceptions.IncorrectPasswordException;
import Usuarios.UsuarioTitular;

import java.util.Scanner;

public class ContaPoupanca extends ContaCorrente {
    private final Scanner scanner = new Scanner(System.in);
    private UsuarioTitular usuarioTitular;

    public ContaPoupanca(UsuarioTitular usuarioTitular) {
        this.usuarioTitular = usuarioTitular;
    }

    public ContaPoupanca() {
    }

    public void investir() {
        saldo = 1700;
        double valorInvestimento;
        System.out.println("Quanto você quer investir?");
        valorInvestimento = scanner.nextInt();

        int senhaOperacao = 0;
        System.out.println("Digite a sua senha de transações:");
        senhaOperacao = scanner.nextInt();

        if (senhaOperacao != usuarioTitular.getSenhaTransacoes()) { //resolver o B.O. da senha de transações
            throw new IncorrectPasswordException("SENHA DE TRANSAÇÕES INCORRETA!");
        }

        saldo = saldo + valorInvestimento;
        System.out.println("Você investiu R$" + valorInvestimento + " e seu saldo atual é R$" + saldo);
    }

    public void resgatar() {
        double valorResgate;
        System.out.println("Quanto você quer resgatar?");
        valorResgate = scanner.nextInt();

        int senhaOperacao = 0;
        System.out.println("Digite a sua senha de transações:");
        senhaOperacao = scanner.nextInt();

        //Guard clause
        if (senhaOperacao != usuarioTitular.getSenhaTransacoes()) { //resolver o B.O. da senha de transações
            throw new IncorrectPasswordException("SENHA DE TRANSAÇÕES INCORRETA!");
        }

        if (valorResgate > saldo) {
            throw new DeniedWithdrawalException("ERRO! VOCÊ NÃO TEM SALDO " +
                    "SUFICIENTE PARA RESGATAR ESSE VALOR"); //withdrawal significa saque
        }
        saldo = saldo - valorResgate;
        System.out.println("Você resgatou R$" + valorResgate + " e seu saldo atual é R$" + saldo);
    }
}