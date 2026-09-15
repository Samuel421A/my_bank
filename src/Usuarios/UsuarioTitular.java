package Usuarios;

import Accounts.ContaCorrente;
import Accounts.ContaPoupanca;
import Exceptions.IncorrectPasswordException;
import Exceptions.InvalidOptionException;

import java.util.Scanner;

public class UsuarioTitular {
    private static final int SENHA_TRANSACOES = 546157;
    private static final String SENHA_CORRETA = "My_bank3745!";
    private final ContaCorrente contaCorrente;
    private final ContaPoupanca contaPoupanca = new ContaPoupanca();

    public UsuarioTitular() {
        contaCorrente = new ContaCorrente(this);
    }
    public void exibirMenu() {
        System.out.println("-------------------------------");
        System.out.println("  BEM-VINDO(A) AO APP MYBANK   ");
        System.out.println("-------------------------------");
        System.out.println("[1] FAZER PIX");
        System.out.println("[2] INVESTIR NA POUPANÇA");
        System.out.println("[3] RESGATAR DA POUPANÇA");
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();

        if (!senha.equals(SENHA_CORRETA)) {
            throw new IncorrectPasswordException("SENHA INCORRETA!");
        }
    }

    public void escolherOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O QUE DESEJA FAZER POR AQUI? ESCOLHA UMA OPÇÃO (1-3)");
        System.out.println("----------------------------");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                contaCorrente.fazerPix();
                break;

            case 2:
                contaPoupanca.investir();
                break;

            case 3:
                contaPoupanca.resgatar();
                break;

            default:
                throw new InvalidOptionException("ERRO: OPÇÃO INVÁLIDA! DIGITE UMA OPÇÃO ENTRE 1 E 3!");
        }
    }

    public int getSenhaTransacoes() {
        return SENHA_TRANSACOES;
    }
}
