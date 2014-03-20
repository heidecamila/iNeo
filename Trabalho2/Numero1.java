/*Programa Numero1.java
Programa referente ao Numero 1 Segunda da Lista de Exercicios
Autora Heide Camila Alves dos Reis
4º Periodo de Engenharia da Computacao
Disciplina de Programacao Orientada a Objetos 
Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero1 {  //Inicio do programa numero 1

	public static void main (String[] args) {  //Inicio metodo main 

		//Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis
		double CustoProdutor;  //Variavel vai receber primeiro numero
		double CustoConsumidor;  //Variavel vai receber segundo numero
                double Custocomimp;

		System.out.println ("\nDigite o custo de Fabrica:"); //Pede para o usuario digitar um numero
		CustoProdutor = entrada.nextDouble();  //coloca para a variavel receber o numero digitado pelo usuario
                Custocomimp =  CustoProdutor + (CustoProdutor * 0.45) ;
                CustoConsumidor = Custocomimp + (CustoProdutor * 0.28);
                
                System.out.printf ("O custo do consumidor sera %.2f \n", CustoConsumidor);
                
	}   //Final metodo main
}  //Final programa numero 1