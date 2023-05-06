// Descrição: Criar uma classe Jogador que tenha as propriedades nome, gols, assistências. E os métodos adicionarGol e adicionarAssistencia que receba como argumento os quantidade de gols/assistências. Também criar dois métodos para ver o número de gols e assistências

package files.ExercisesCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Player {
  public String nome;
  public ArrayList<Integer> statistics;

  public Player(String nome, ArrayList<Integer> statistics) {
    this.nome = nome;
    this.statistics = statistics;
  }

  public void setGol(HashMap<String, ArrayList<Integer>> players, Scanner scanner) {
    if (players.containsKey(this.nome)) {
      System.out.print("Digite a quantidade de gols: ");
      int gols = scanner.nextInt();

      players.get(this.nome).set(0, gols);
      System.out.printf("\nGols adicionados com sucesso!\n");

    } else {
      System.out.printf("\nJogador %s não encontrado!\n", this.nome);
    }
    
  }

  public void setAssistence(HashMap<String, ArrayList<Integer>> players, Scanner scanner) {
    if (players.containsKey(this.nome)) {
      System.out.print("Digite a quantidade de assistências: ");
      int assistencias = scanner.nextInt();

      players.get(this.nome).set(1, assistencias);
      System.out.printf("\nAssistências adicionadas com sucesso!\n");

    } else {
      System.out.printf("\nJogador %s não encontrado!\n", this.nome);
    }
  }

  public String getGols(HashMap<String, ArrayList<Integer>> players, String nome) {
    if (players.containsKey(nome)) {
      return String.format("Jogador: %s | Gols: %d", nome, players.get(nome).get(0));

    } else {
      return String.format("\nJogador %s não encontrado!\n", nome);
    }
  }

  public String getAssistencia(HashMap<String, ArrayList<Integer>> players, String nome) {
    if (players.containsKey(nome)) {
      return String.format("Jogador: %s | Assistências: %d", nome, players.get(nome).get(1));

    } else {
      return String.format("\nJogador %s não encontrado!\n", nome);
    } 
  }
}
