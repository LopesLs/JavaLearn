package files.AulasCode;
import java.util.Scanner; // Importa a classe Scanner

public class ExemploInput {
  public static void main(String[] args) {
    @SuppressWarnings("resource") // Suprime o aviso de que o objeto Scanner não foi fechado
    Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("\nExemploInput.java");

    System.out.print("\nDigite o primeiro número: "); // Exibe a mensagem
    int valor1 = entrada.nextInt(); // Lê um número inteiro

    System.out.print("Digite o segundo número: ");
    int valor2 = entrada.nextInt();

    System.out.printf("A soma entre %d e %d é = %d\n", valor1, valor2, (valor1 + valor2)); // Exibe a soma

    System.out.print("Digite o dia da semana: ");
    int dia = entrada.nextInt();

    // Remova o comentário caso esteja executando o própio código
    // entrada.close(); // Fecha o objeto Scanner

    switch (dia) {
      case 1:
        System.out.println(ExemploInputEnun.Domingo);
        break;
      case 2:
        System.out.println(ExemploInputEnun.Segunda);
        break;
      case 3:
        System.out.println(ExemploInputEnun.Terça);
        break;
      case 4:
        System.out.println(ExemploInputEnun.Quarta);
        break;
      case 5:
        System.out.println(ExemploInputEnun.Quinta);
        break;
      case 6:
        System.out.println(ExemploInputEnun.Sexta);
        break;
      case 7:
        System.out.println(ExemploInputEnun.Sábado);
        break;
      default:
        System.out.println("Dia inválido");
        break;
    }
  }
};
