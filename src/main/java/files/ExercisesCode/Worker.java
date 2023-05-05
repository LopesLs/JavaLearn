// Descrição: Cria uma classe do tipo Funcionario, com os campos: nome, função e cargo. Crie uma lista e adicione 10 objetos do tipo Funcionario dentro dela. Depois exiba no console todas informações de cada objeto

package files.ExercisesCode;
import java.util.ArrayList;

public class Worker {
  private String nome;
  private String funcao;
  private String cargo;

  public Worker(String nome, String funcao, String cargo) {
    this.nome = nome;
    this.funcao = funcao;
    this.cargo = cargo;
  }

  public static void main(String[] args) {
    ArrayList<Worker> listaFuncionarios = new ArrayList<>();

    listaFuncionarios.add(new Worker("João", "Desenvolvedor", "Pleno"));
    listaFuncionarios.add(new Worker("Maria", "Analista", "Sênior"));
    listaFuncionarios.add(new Worker("Pedro", "Desenvolvedor", "Júnior"));
    listaFuncionarios.add(new Worker("Fernanda", "Analista", "Pleno"));

    // Introduzindo o programa ao usuário
    System.out.println("\n> Worker.java");
    System.out.println("Este programa cria uma lista de funcionários e exibe suas informações no console.\n");

    for (Worker worker : listaFuncionarios) {
        System.out.printf("Nome: %s | Função: %s | Cargo: %s\n", worker.getNome(), worker.getFuncao(), worker.getCargo());
    }
  }

  public String getNome() {
      return nome;
  }

  public String getFuncao() {
      return funcao;
  }

  public String getCargo() {
      return cargo;
  }
}
