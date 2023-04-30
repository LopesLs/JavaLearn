package files.ExercisesCode;

// Descrição: As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25 se forem comprados pelo menos uma dúzia. Escreva um programa que leia a quantidade de maçãs compradas e depois imprima o valor total da compra no console.

import java.util.Scanner;

public class Apple {
  public static void main(String[] args, Scanner scanner) {

    // Introduzindo o programa para o usuário
    System.out.println("\nApple.java");
    System.out.println("Este programa calcula o preço total de maçãs compradas.");

    // Pede a quantidade de maçãs
    System.out.print("\nQuantas maçãs você deseja comprar? ");
    int apples = scanner.nextInt();

    // Verifica a quantidade de maçãs e aplica o desconto
    if (apples < 12) {
      System.out.println("\nNota: Você está comprando menos que uma dúzia, a unidade custa R$0,30");
      System.out.printf("O preço que você vai pagar pelas %d maçãs é: R$%.2f\n", apples, (apples * 0.30));
    } else {
      System.out.println("\nNota: Você está comprando pelo menos uma dúzia, a unidade custará R$0,25");
      System.out.printf("O preço que você vai pagar pelas %d maçãs é: R$%.2f\n", apples, (apples * 0.25));
    }
  }
}