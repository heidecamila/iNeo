/*Programa Numero5.java
Programa referente ao Numero 5 da Segunda Lista de Exercicios
Autora Heide Camila Alves dos Reis
4º Periodo de Engenharia da Computacao
Disciplina de Programacao Orientada a Objetos 
Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero5 {  //Inicio do programa numero 5

	public static void main (String[] args) {  //Inicio metodo main 

		//Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis

	String nome; //Cria a variavel para receber do usuario o nome
	int nota1;  //Cria a variavel para receber do usuario a primeira nota
        int nota2;  //Cria a variavel para receber do usuario a segunda nota
	int nota3;  //Cria a variavel para receber do usuario a terceira nota
	double medianotas;   //Cria a variavel para receber a media das notas

        System.out.println ("Digite o nome do aluno:");  //Pede ao usuario para digitar o nome
        nome = entrada.nextLine();// Recebe string
        System.out.println ("Digite a primeira nota do aluno:");  ///Pede ao usuario a primeira nota
        nota1 = entrada.nextInt ();  //coloca para a variavel para receber a primeira nota
        System.out.println ("Digite a segunda nota do aluno:");  ///Pede ao usuario a segunda nota
        nota2 = entrada.nextInt ();  //coloca para a variavel para receber a segunda nota
        System.out.println ("Digite a terceira nota do aluno:");  ///Pede ao usuario a terceira nota
        nota3 = entrada.nextInt ();  //coloca para a variavel para receber a terceira nota
        medianotas = (nota1 + nota2 + nota3) / 3; //faz a media das notas
	System.out.printf ("Nome: %s\n", nome);  //Exibe o nome digitado pelo usuario
	System.out.printf ("Media das notas: %.2f\n", medianotas);  //Exibe para o usuario a media das notas
        if (medianotas>=7) System.out.println ("Aprovado");
        else if (medianotas>5.1&&medianotas<6.9) System.out.println ("Recuperacao");
        else System.out.println ("Reprovado");
        }  //Final metodo main
}  //Final programa numero 5