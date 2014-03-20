/*Programa Numero2.java
Programa referente ao Numero 2 Segunda da Lista de Exercicios
Autora Heide Camila Alves dos Reis
4º Periodo de Engenharia da Computacao
Disciplina de Programacao Orientada a Objetos 
Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero2 {  //Inicio do programa numero 1

	public static void main (String[] args) {  //Inicio metodo main 

		//Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis
		int numero;  //Variavel vai receber primeiro numero

		System.out.println ("\nDigite um numero:"); //Pede para o usuario digitar um numero
		numero = entrada.nextInt();  //coloca para a variavel receber o numero digitado pelo usuario

                if (numero > 10) System.out.println ("Numero maior que 10 ");
                else System.out.println ("Numero menor que 10");
                
	}   //Final metodo main
}  //Final programa numero 2
