package files.ExercisesCode;

// Descrição: Escreva um programa que leia o salário bruto de um funcionário e mostre o valor líquido. Se o salário for menor que R$ 1.000 o desconto é 6% Até R$ 2.500 é 8% Até R$ 4.800 é 10% Maior que 4.800 é 15%

import java.util.Scanner;

public class Wage {
  public static void main(String[] args) {
    @SuppressWarnings("resource") // Remove o aviso de que o objeto Scanner não foi fechado
    Scanner input = new Scanner(System.in); // Cria o objeto Scanner

    // Introduzindo o programa para o usuário
    System.out.println("\nWage.java");
    System.out.println("Este programa lê o salário bruto de um funcionário e mostra o valor líquido.");

    // Pede o salário bruto
    System.out.print("\nDigite o salário bruto: ");
    double wage = input.nextDouble();
    double liquidWage = 0;

    // Verifica o salário e aplica o desconto
    if (wage < 1000) {
      System.out.println("\nNota: Salário menor que R$1.000,00 = 6% de desconto");
      liquidWage = wage - (wage * 0.06);
    } else if (wage <= 2500) {
      System.out.println("\nNota: Salário menor que R$2.500,00 = 8% de desconto");
      liquidWage = wage - (wage * 0.08);
    } else if (wage <= 4800) {
      System.out.println("\nNota: Salário menor que R$4.800,00 = 10% de desconto");
      liquidWage = wage - (wage * 0.10);
    } else {
      System.out.println("\nNota: Salário maior que R$4.800,00 = 15% de desconto");
      liquidWage = wage - (wage * 0.15);
    }

    // Mostra o salário líquido
    System.out.printf("Salário líquido: R$%.2f\n", liquidWage);

    // Remova o comentário caso esteja executando o próprio código
    // input.close(); // Fecha o objeto Scanner
  }
}