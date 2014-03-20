/*Programa Numero8.java
 Programa referente ao Numero 8 da Segunda Lista de Exercicios
 Autora Heide Camila Alves dos Reis
 Disciplina de Programacao Orientada a Objetos 
 Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero11 {  //Inicio do programa numero 7

    public static void main(String[] args) {  //Inicio metodo main 

        //Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
        Scanner entrada = new Scanner(System.in);
        //declarar variaveis

        int numero;

        System.out.println("Digite um numero:");
        numero = entrada.nextInt();

        if (numero > 80) {
            System.out.println("Maior que 80");
        } else if (numero < 25) {
            System.out.println("Menor que 25");
        } else if (numero == 40) {
            System.out.println("Igual a 40");
        }

    }  //Final metodo main
}  //Final programa numero 8
