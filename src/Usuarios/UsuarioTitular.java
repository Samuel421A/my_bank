package Usuarios;

import Exceptions.InvalidAgeException;
import Exceptions.InvalidCPFException;
import Exceptions.InvalidPasswordException;

import java.util.Scanner;

public class UsuarioTitular {
    public void fazerCadastro() {
        String nome;
        String telefone;
        String CPF; //deve ser String porque é um identificador, não um número para fazer contas (a mesma coisa para o telefone)
        int idade;
        int senhaTransacoes;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" [CADASTRO]");
        System.out.println("--------------");
        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        if (idade < 18) {
            throw new InvalidAgeException("ATENÇÃO: VOCÊ DEVE SER MENOR " +
                    "DE IDADE PARA SE CADASTRAR");
        }

        System.out.println("Digite o seu telefone:");
        telefone = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite o seu CPF:");
        CPF = scanner.nextLine();

        if (CPF.length() != 11) {
            throw new InvalidCPFException("CPF INVÁLIDO!");
        }

        System.out.println("Digite uma senha de transações de SEIS dígitos:");
        senhaTransacoes = scanner.nextInt();
        int digitos = String.valueOf(Math.abs(senhaTransacoes)).length();

        if (digitos != 6) {
            throw new InvalidPasswordException("Erro: a senha deve ter 6 dígitos!");
        }
    }
}
