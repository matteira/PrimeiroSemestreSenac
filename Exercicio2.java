package ADO;
import java.util.Scanner;

/*2. Criar um programa que leia a idade de uma pessoa expressa em anos, mês e dias e apresente na tela a idade dessa pessoa
expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

Aluno: Gabriel Mattos Costa

*/ 

public class Exercicio2{
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite seu ano, mês e dia para saber sua idade em dias.");
    System.out.println();

    System.out.print("Ano: ");
    int a = leitor.nextInt();

    System.out.print("Mês: ");
    int m = leitor.nextInt();

    System.out.print("Dia: ");
    int d = leitor.nextInt();
    System.out.println();

    int df = (d+(a*365)+(m*30));
    System.out.print("Sua idade em dias é de " + df);

    }
}