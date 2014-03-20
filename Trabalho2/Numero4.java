/*Programa Numero4.java
Programa referente ao Numero 4 Segunda da Lista de Exercicios
Autora Heide Camila Alves dos Reis
4º Periodo de Engenharia da Computacao
Disciplina de Programacao Orientada a Objetos 
Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero4 {  //Inicio do programa numero 1

	public static void main (String[] args) {  //Inicio metodo main 

		//Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis
		int numero;  //Variavel vai receber primeiro numero

		System.out.println ("\nDigite um numero:"); //Pede para o usuario digitar um numero
		numero = entrada.nextInt();  //coloca para a variavel receber o numero digitado pelo usuario
                
                if (numero>100&&numero<200) System.out.println ("Ele esta dentro do intervalo");
                else System.out.println ("Este numero nao esta dentro do intervalo");
                

                
	}   //Final metodo main
}  //Final programa numero 4