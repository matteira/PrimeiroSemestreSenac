package ADO;
import java.util.Scanner;

/*3. Criar um programa que calcule e apresente na tela o volume de uma esfera de raio R, em que R é um dado fornecido pelo
usuário. O volume de uma esfera é dado por V =
4
3
πR3

Aluno: Gabriel Mattos Costa

.*/

public class Exercicio3 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
    
            System.out.print("Digita o raio da esfera: ");
    
            double p = 3.14;
            double r = leitor.nextDouble();
            double El = Math.pow(r, 3);
            double Ve = 4 * p * El / 3;
            
            System.out.print("O volume da esfera é de " + Ve + " !");
    
    
    }
}
