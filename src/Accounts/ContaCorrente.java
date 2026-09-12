package Accounts;

import Exceptions.IncorrectPixKeyException;

import java.util.Scanner;

public class ContaCorrente {
    public static final int NUMERO_AGENCIA = 4521;
    private static final int NUMERO_CONTA = 633785;
    private final Scanner scanner = new Scanner(System.in);

    double saldo;
    private String extrato;
    private int senhaDeTransacoes;

    public void fazerPix() {
        System.out.println("Digite a chave pix: ");
        int chavePix = scanner.nextInt();
        int quantidadeCaracteres = String.valueOf(Math.abs(chavePix)).length();

        System.out.println("Quanto você quer transferir? ");
        double valorPix = scanner.nextDouble();

        if (quantidadeCaracteres > 6) {
            throw new IncorrectPixKeyException("ERRO! CHAVE PIX INCORRETA!");
        } else {
            saldo = saldo - valorPix;
            System.out.println("VOCÊ TRANSFERIU R$" + valorPix + " COM SUCESSO! " +
                    "SEU SALDO ATUAL É R$" + saldo);
        }
    }
}

