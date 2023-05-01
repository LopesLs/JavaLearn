// Descrição: Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das notas podem chegar no máximo 100. Cria um método que retorne o nome do aluno, sua média, a maior e menor nota.

package files.ExercisesCode.MediaAluno;

public class AlunoApp {
  public static void main(String[] args) {
    // Criando instâncias da classe Aluno
    Aluno student1 = new Aluno("João", 42, 50, 100);
    Aluno student2 = new Aluno("Maria", 100, 100, 100);

    // Introduzindo o programa para o usuário
    System.out.println("\n> AlunoApp.java");
    System.out.println("Este programa calcula a média de um aluno e retorna seu nome e média.");

    // Imprimindo os dados dos alunos
    System.out.println(student1.getNameAndAverage());
    System.out.println(student2.getNameAndAverage());
  }
}
