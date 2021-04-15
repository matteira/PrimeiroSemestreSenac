package ADO;

import java.util.Scanner;

/*1. Criar um programa que receba o valor do salário de um funcionário e o valor do salário mínimo e apresente na tela quantos
salários mínimos ganha esse funcionário.

Aluno: Gabriel Mattos Costa

*/


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Salário minimo = ");
        int _salariominimo = leitor.nextInt();

        System.out.print("Informe o salário do funcionario = ");
        int salario = leitor.nextInt();

        int resultado = salario/_salariominimo;
        System.out.print("O funcionario ganha " + resultado + " salário mínimo !");
    }
}


    