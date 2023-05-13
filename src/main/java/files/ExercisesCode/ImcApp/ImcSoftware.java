package files.ExercisesCode.ImcApp;
import java.util.Scanner;

public class ImcSoftware {
  public static void main(String[] args, Scanner scanner) {
    // Introduzindo o programa para o usuário
    System.out.println("\n> ImcSoftware.java");
    System.out.println("Este programa lê o peso e a altura de uma pessoa e mostra o IMC e a classificação.");
    
    // Pede o peso e a altura
    System.out.print("\nDigite seu peso (Kg): ");
    double peso = scanner.nextDouble();
    System.out.print("Digite sua altura (m): ");
    double altura = scanner.nextDouble();

    Imc imc = new Imc(peso, altura);

    System.out.printf("\nSeu IMC é: %.2f", imc.calculateImc());
    imc.imcClassification(imc.calculateImc());
  }
}