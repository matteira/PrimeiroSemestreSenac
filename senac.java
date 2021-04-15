package Estudos;

import java.util.Scanner;

/*class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Velocidade: ");
    float veloc = leitor.nextFloat();
    if (veloc > 70){
      System.out.println("Multado menor!");
    }
    else{
      System.out.println("Ta liso pode passar menor...");
    }
        
      
    }
  }*/

  /*class Main{
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Media: ");
    float media = leitor.nextFloat();
    if (media >= 9){
      System.out.println("O Conceito é A");
    }
    else if (media >= 7){
      System.out.println("O Conceito é B");
    }
    else if (media >= 6){
      System.out.println("O Conceito é C");
    }
    else{
      System.out.println("O Conceito é D");
    }
        
      
    }
  }*/


  /*class Main{
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      System.out.print("Seu salario: ");
      float salario = leitor.nextFloat();
      float novoSalario;
      if (salario < 500){
        novoSalario = salario *1.15f;
        System.out.println("Seu novo salario: " + novoSalario + " !");
      }
      else if (salario <= 1000){
        novoSalario = salario *1.10f;
        System.out.println("Seu novo salario: " + novoSalario + " !");
      }
      else {
        novoSalario = salario *1.05f;
        System.out.println("Seu novo salario: " + novoSalario + " !");
      }
  }
}*/

/*class Main{
  public static void main(String[] args) {
    int idade = 15;
    boolean amigoDoDono = false; //true;
    if (idade < 18 && !amigoDoDono){
      System.out.println("Não pode entrar menor");
    }
    else {
      System.out.println("Pode entrar menor");
    }
  }
}*/

/*class Main{
  public static void main(String[] args) {
    int diaDaSemana = 1;
    switch (diaDaSemana){
      case 1 :
      System.out.println("Domingo");
      break;
      case 2 :
      System.out.println("Segunda");
      break;
      default:
      System.out.println("TEM N NO DIA DA SEMANA FDP");
    }
  }
}*/

/*class Main{
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   System.out.print("Mês: ");
   int mes = leitor.nextInt();
   switch (mes) {
     case 1:
     case 12:
      System.out.println("Ferias");
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Primeiro Semestre letivo");
        break;
      case 7:
        System.out.println("Recesso");
        break;
      case 8:
      case 9:
      case 10:
      case 11:
        System.out.println("Segundo semestre letivo");
        break;
      default:
        System.out.println("Mês invalido!");
   }
  }
}*/


/*class Main {



  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.print("kWh Consumido: ");

    int kwhConsumido = leitor.nextInt();

    float valor;

    if (kwhConsumido < 150) {

      valor = kwhConsumido * 0.20f;

    } else if (kwhConsumido < 500) {

      valor = kwhConsumido * 0.25f;

    } else {

      valor = kwhConsumido * 0.30f;

    }

    if (valor < 11.90f) {

      valor = 11.90f;

    }

    System.out.println("Valor da Conta: " + String.format("%.2f", valor));

  }

}*/

