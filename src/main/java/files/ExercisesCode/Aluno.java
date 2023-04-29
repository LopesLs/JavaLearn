// Descrição: Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das notas podem chegar no máximo 100. Cria um método que retorne o nome do aluno, sua média, a maior e menor nota.

package files.ExercisesCode;

public class Aluno {

  // Atributos
  private String name;
  private int note1;
  private int note2;
  private int note3;

  // Construtor
  public Aluno(String name, int note1, int note2, int note3) {
    this.name = name;
    this.note1 = note1;
    this.note2 = note2;
    this.note3 = note3;

    // Verificando se as notas são válidas
    if (note1 > 100 || note2 > 100 || note3 > 100) {
      System.out.println("As notas não podem ser maiores que 100.");
      System.exit(0); // Encerrando o programa

    } else if (this.note1 < 0 || this.note2 < 0 || this.note3 < 0) {
      System.out.println("As notas não podem ser menores que 0.");
      System.exit(0);
    }
  }

  // Método que retorna o nome do aluno e sua média
  public String getNameAndAverage() {
    return String.format("\nDados do aluno:\nNome: %s\nMédia: %d", this.name,  (this.note1 + this.note2 + this.note3) / 3);
  }
}
