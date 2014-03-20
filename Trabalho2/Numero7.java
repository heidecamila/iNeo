var
   nome,sexo:literal
   h,m,i,sexovalido:inteiro
   //h= total de homens, m= total de mulheres
inicio
// Seção de Comandos
para i de 1 ate 6 faca
     sexovalido <- 0
     escreval("Informe o nome da pessoa ",i)
     leia(nome)
     enquanto sexovalido = 0 faca
        escreval("Escolha o sexo: ")
        escreval("F - Feminino")
        escreval("M - Masculino")
        leia(sexo)
           escolha(sexo)
               caso "F"
               sexovalido<-1
               caso "M"
               sexovalido<-1
               outrocaso
               sexovalido<-0
               escreval("Opção Invalida, tente novamente!")
           fimescolha
     fimenquanto
     se sexo = "F" entao
     m<-m+1
     escreval(nome," eh mulher!")
     senao
     h<-h+1
     escreval(nome," eh homem!")
     fimse
fimpara
escreval("Foram informados ",h," homens e ",m," mulheres")
fimalgoritmo