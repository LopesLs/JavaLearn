package files.ExercisesCode;
import java.util.Scanner;

public class Imc {
  public static void main(String[] args, Scanner scanner) {
    // Introduzindo o programa para o usuário
    System.out.println("\n> Imc.java");
    System.out.println("Este programa lê o peso e a altura de uma pessoa e mostra o IMC e a classificação.");
    
    // Pede o peso e a altura
    System.out.print("\nDigite seu peso (Kg): ");
    double peso = scanner.nextDouble();
    System.out.print("Digite sua altura (m): ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura); // Fórmula do IMC

    System.out.printf("\nSeu IMC é: %.2f", imc);

    // Verifica o IMC e mostra a classificação
    if (imc < 18.5) {
      System.out.println(" (Abaixo do peso)");
    } else if (imc < 25) {
      System.out.println(" (Peso normal)");
    } else if (imc < 30) {
      System.out.println(" (Sobrepeso)");
    } else if (imc < 35) {
      System.out.println(" (Obesidade grau 1)");
    } else if (imc < 40) {
      System.out.println(" (Obesidade grau 2)");
    } else {
      System.out.println(" (Obesidade grau 3)");
    }
  }
}