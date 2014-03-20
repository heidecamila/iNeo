/*Programa Numero3.java
Programa referente ao Numero 3 Segunda da Lista de Exercicios
Autora Heide Camila Alves dos Reis
4º Periodo de Engenharia da Computacao
Disciplina de Programacao Orientada a Objetos 
Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero3 {  //Inicio do programa numero 1

	public static void main (String[] args) {  //Inicio metodo main 

		//Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis
		int numero;  //Variavel vai receber primeiro numero
                int numero1;
                int numero2;

		System.out.println ("\nDigite o primeiro numero numero:"); //Pede para o usuario digitar um numero
		numero = entrada.nextInt();  //coloca para a variavel receber o numero digitado pelo usuario
		System.out.println ("\nDigite o segundo numero numero:"); //Pede para o usuario digitar um numero
		numero1 = entrada.nextInt();  //coloca para a variavel receber o numero digitado pelo usuario
		System.out.println ("\nDigite o terceiro numero numero:"); //Pede para o usuario digitar um numero
		numero2 = entrada.nextInt();  //coloca para a variavel receber o numero digitado pelo usuario

                if (numero>numero1&&numero>numero2) System.out.printf ("O numero %d eh maior\n", numero);
                else if (numero1>numero&&numero1>numero2) System.out.printf ("O numero%d eh maior\n", numero1);
                else System.out.printf ("O numero %d eh maior\n", numero2);
                
	}   //Final metodo main
}  //Final programa numero 3