package files.ExercisesCode;

// Descrição: Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.

import java.util.Scanner;

public class Biggestandsmallest {
  public static void main(String[] args, Scanner scanner) {
    float biggest = 0;
    float smallest = 0;

    // Introduzindo o programa para o usuário
    System.out.println("\n> Biggestandsmallest.java");
    System.out.println("Este programa lê 3 valores e printa o maior e o menor entre eles.");

    // Loop para ler os 3 valores
    for (int iterator = 0; iterator < 3; iterator++) {
      System.out.printf("\nDigite o %d valor: ", iterator + 1);
      float value = scanner.nextFloat();

      // Verifica se é a primeira iteração do loop para definir o maior e o menor
      // valor
      if (iterator == 0) {
        biggest = value;
        smallest = value;
      }

      // Verifica se o valor é maior que o maior valor
      if (value > biggest) {
        biggest = value;
      }

      // Verifica se o valor é menor que o menor valor
      if (value < smallest) {
        smallest = value;
      }
    }

    // Imprimindo os resultados
    System.out.printf("\nO maior valor é: %.2f\n", biggest);
    System.out.printf("O menor valor é: %.2f\n", smallest);
  }
}