package Accounts;

import Exceptions.IncorrectPixKeyException;

import java.util.Scanner;

public class ContaCorrente {
    private double saldo;
    private String extrato;
    private int senhaDeTransacoes;
    private final Scanner scanner = new Scanner(System.in);

    public void fazerPix() {
        System.out.println("Digite a chave pix: ");
        int chavePix = scanner.nextInt();
        int quantidadeCaracteres = String.valueOf(Math.abs(chavePix)).length();

        if (quantidadeCaracteres > 6) {
            throw new IncorrectPixKeyException("ERRO! CHAVE PIX INCORRETA!");
        }
    }
}

