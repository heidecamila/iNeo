/*Programa Numero8.java
 Programa referente ao Numero 8 da Segunda Lista de Exercicios
 Autora Heide Camila Alves dos Reis
 4º Periodo de Engenharia da Computacao
 Disciplina de Programacao Orientada a Objetos 
 Professor Andre Rabelo*/

import java.util.Scanner; //importar os metodos Scanner

public class Numero12 {  //Inicio do programa numero 7

    public static void main(String[] args) {  //Inicio metodo main 

        //Cria um Scanner para obter entrada da janela de comando (receber entradas do teclado)
        Scanner entrada = new Scanner(System.in);
        //declarar variaveis

        int numero;

        System.out.println("Digite o numero referente ao mes:");
        numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Digito incorreto");
                break;
        }
    }  //Final metodo main
}  //Final programa numero 8