// Criar uma classe Jogador que tenha as propriedades nome, gols, assistências. E os métodos adicionarGol e adicionarAssistencia que receba como argumento os quantidade de gols/assistências. Também criar dois métodos para ver o número de gols e assistências

package files.ExercisesCode;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class PlayerApp {
  public static void main(String[] args, Scanner scanner) {
    HashMap<String, ArrayList<Integer>> players = new HashMap<String, ArrayList<Integer>>();
    Player player = new Player(null, null);

    // Introduzindo o programa para o usuário
    System.out.println("\n> Player.java");
    System.out.println("Este programa cria um jogador e adiciona gols e assistências a ele.");

    while (true) {
      System.out.println("\nOpções:");
      System.out.println("1 - Criar jogador");
      System.out.println("2 - Adicionar gols");
      System.out.println("3 - Adicionar assistências");
      System.out.println("4 - Ver gols");
      System.out.println("5 - Ver assistências");
      System.out.println("0 - Sair\n");

      System.out.print("> Digite a opção desejada: ");
      int option = scanner.nextInt();

      switch (option) {
        case 0:
          System.out.println("\nSaindo...");
          System.exit(option);
          break;

        case 1:
          System.out.print("\n> Digite o nome do jogador: ");
          player.nome = scanner.next();

          ArrayList<Integer> playerStatistics = new ArrayList<Integer>();        
          playerStatistics.add(0);
          playerStatistics.add(0);

          player.statistics = playerStatistics;
          players.put(player.nome, player.statistics);
  
          System.out.printf("\n!Aviso! Jogador %s criado com sucesso.\n", player.nome);
          break;

        case 2:
          System.out.print("\n> Digite o nome do jogador: ");
          player.nome = scanner.next();

          player.setGol(players, scanner);
          
          break;
        
        case 3:
          System.out.print("\n> Digite o nome do jogador: ");
          player.nome = scanner.next();

          player.setAssistence(players, scanner);

          break;
        
        case 4:
          System.out.print("\n> Digite o nome do jogador: ");
          player.nome = scanner.next();

          System.out.printf("\n%s\n", player.getGols(players, player.nome));

          break;
        
        case 5:
          System.out.print("\n> Digite o nome do jogador: ");
          player.nome = scanner.next();

          System.out.printf("\n%s\n", player.getAssistencia(players, player.nome));

          break;
      }
    }
  }
}