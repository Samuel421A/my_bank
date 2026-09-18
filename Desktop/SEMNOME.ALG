algoritmo "semnome"
var
   soma, subtracao, multiplicacao, N1, N2, opcao: inteiro
   divisao: real

Procedimento mostrarMenu()
inicio
Escreva()
Escreval("-------------------")
Escreval("     OPERAÇÕES     ")
Escreval("-------------------")
Escreval("[1] SOMA")
Escreval("[2] SUBTRAÇÃO")
Escreval("[3] MULTIPLICAÇÃO")
Escreval("[4] DIVISÃO")
Escreval("[5] SAIR")
FimProcedimento
inicio
   Escreva("Digite o primeiro número: ")
   Leia(N1)
   Escreva("Digite o segundo número: ")
   Leia(N2)

   mostrarMenu()

   Escreva("ESCOLHA UMA DAS OPERAÇÕES E VEJA O QUE ACONTECE COM OS NÚMEROS: ")
   Leia(opcao)

   Repita
      Escolha (opcao)
      Caso 1
         soma <- N1 + N2
         Escreva(N1, " + ", N2, " = ", soma)

      Caso 2
         subtracao <- N1 - N2
         Escreva(N1, " - ", N2, " = ", subtracao)

      Caso 3
         multiplicacao <- N1 * N2
         Escreva(N1, " x ", N2, " = ", multiplicacao)
         
      Caso 4
         Se(N2 = 0) entao
           Escreva("ERRO! NÃO SE PODE DIVIDIR POR ZERO!")
         senao
           divisao <- N1/N2
           Escreva(N1, " / ", N2, " = ", divisao)
         FimSe
   Ate (opcao = 5)
fimalgoritmo