/*Programa Numero8.java
 Programa referente ao Numero 8 da Segunda Lista de Exercicios
 Autora Heide Camila Alves dos Reis
 4º Periodo de Engenharia da Computacao
 Disciplina de Programacao Orientada a Objetos 
 Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero8 {  //Inicio do programa numero 7

    public static void main(String[] args) {  //Inicio metodo main 

        //Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
        Scanner entrada = new Scanner(System.in);
        //declarar variaveis

        double nome;  //Cria a variavel para receber do usuario a primeira nota
        int s;
        int h = 0;
        int m = 0;
        int valido = 0;
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println("Digite o nome:");
            nome = entrada.nextDouble();
            System.out.println("Digite 1 para sexo feminino e 2 para sexo masculino:");
            s = entrada.nextInt();
            switch (s) {
                case 1:
                    valido = 1;
                case 2:
                    valido = 1;
                default: {
                    System.out.println("Digito incorreto, tente novamente");
                    valido = 0;
                }
            }
            if (s == 1) {
                System.out.println("Eh mulher");
                m = m + 1;
            } else {
                System.out.println("Eh homem");
                h = h + 1;
            }
        }
        System.out.printf("\nO numero total de mulheres eh %d", m, "e de homens eh %d\n", h);
    }  //Final metodo main
}  //Final programa numero 8