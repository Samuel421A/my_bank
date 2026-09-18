Algoritmo "semnome"

Var
   email, email_cadastro: caractere
   senha, senha_cadastro: inteiro
Inicio
   Escreval("CADASTRO")
   Escreva("Email: ")
   Leia(email_cadastro)

   Escreva("Senha: ")
   Leia(senha_cadastro)
   
   email <- email_cadastro
   senha <- senha_cadastro
   
   LimpaTela
   Escreval("LOGIN")
   
   Escreva("Email: ")
   Leia(email)
   
   Escreva("Senha: ")
   Leia(senha)
   
   Se(email = email_cadastro) e (senha = senha_cadastro) entao
     Escreva("LOGIN EFETUADO COM SUCESSO!")
   senao
      Escreva("USUÁRIO OU SENHA INCORRETOS!")
   FimSe
Fimalgoritmo