package Usuarios;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidCPFException;

import java.util.Scanner;

public class UsuarioTitular {
    public void fazerCadastro() {
        String nome;
        String telefone;
        int idade;
        int CPF;
        int senhaTransacoes;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---CADASTRO---");
        System.out.println("--------------");
        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();

        if (idade < 18) {
            throw new InvalidAgeException("ATENÇÃO: VOCÊ DEVE SER MENOR " +
                    "DE IDADE PARA SE CADASTRAR");
        }

        System.out.println("Digite o seu telefone:");
        telefone = scanner.nextLine();

        System.out.println("Digite o seu CPF:");
        CPF = scanner.nextInt();
        int digitos = String.valueOf(Math.abs(CPF)).length();

        if (digitos != 11) {
            throw new InvalidCPFException("CPF INVÁLIDO!");
        }
    }
}
