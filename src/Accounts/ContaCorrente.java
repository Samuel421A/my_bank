package Accounts;

import Exceptions.IncorrectPasswordException;
import Exceptions.InvalidPixKeyException;
import Usuarios.UsuarioTitular;

import java.util.Scanner;

public class ContaCorrente {
    public static final int NUMERO_AGENCIA = 4521;
    private static final int NUMERO_CONTA = 633785;
    private final Scanner scanner = new Scanner(System.in);
    private UsuarioTitular usuario;

    double saldo;
    private String extrato;

    public ContaCorrente() {
    }

    public ContaCorrente(UsuarioTitular usuario) {
        this.usuario = usuario;
    }

    public void fazerPix() {
        System.out.println("Digite a chave pix: ");
        String chavePix = scanner.nextLine();

        System.out.println("Quanto você quer transferir? ");
        double valorPix = scanner.nextDouble();

        int senhaOperacao = 0;
        System.out.println("Digite a sua senha de transações:");
        senhaOperacao = scanner.nextInt();

        //Guard clause
        if (senhaOperacao != usuario.getSenhaTransacoes()) { //resolver o B.O. da senha de transações
            throw new IncorrectPasswordException("SENHA DE TRANSAÇÕES INCORRETA!");
        }

        if (chavePix.length() > 6) {
            throw new InvalidPixKeyException("ERRO! CHAVE PIX INCORRETA!");
        }

        saldo = saldo - valorPix;
        System.out.println("VOCÊ TRANSFERIU R$" + valorPix + " COM SUCESSO! " +
                    "SEU SALDO ATUAL É R$" + saldo);

    }
}

