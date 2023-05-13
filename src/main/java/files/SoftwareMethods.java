package files;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class SoftwareMethods {

  public SoftwareMethods() {
    subDirectoriesClass.put("AlunoApp.java", "MediaAluno/");
    subDirectoriesClass.put("BankAccountApp.java", "Bank/");
    subDirectoriesClass.put("ExemploInput.java", "InputExample/");
    subDirectoriesClass.put("OrderApp.java", "Orders/");
    subDirectoriesClass.put("Imc.java", "ImcApp/");
  }

  ArrayList<String> codeClassNames = new ArrayList<String>(Arrays.asList("ExemploInput.java", "Introduction.java", "Loops.java", "PrimitivoVsObjeto.java", "OrderApp.java", "BankAccountApp.java"));
  ArrayList<String> codeExercisesNames = new ArrayList<String>(Arrays.asList("Apple.java", "Wage.java", "Biggestandsmallest.java", "AlunoApp.java", "ImcSoftware.java", "Worker.java", "Inheritance.java", "PlayerApp.java"));
  HashMap<String, String> subDirectoriesClass = new HashMap<>();
  
  public void showStartMenu() {
    System.out.println("\n+-------------------------------------+");
    System.out.println("|            Menu Principal           |");
    System.out.println("+-------------------------------------+");
    System.out.println("| 1 - Códigos feitos em sala de aula  |");
    System.out.println("| 2 - Códigos de exercícios propostos |");
    System.out.println("| 3 - Sair                            |");
    System.out.println("+-------------------------------------+");

    System.out.print("\n> Digite o número da opção desejada: ");
  }

  public void showCodesClassMenu() {
    System.out.println("\n+-------------------------------------+");
    System.out.println("|    Códigos feitos em sala de aula   |");
    System.out.println("+-------------------------------------+");
    for (int iterator = 0; iterator < this.codeClassNames.size(); iterator++) {
      System.out.printf("| %d - %s \n", iterator + 1, this.codeClassNames.get(iterator));
    }
    System.out.print("| 0 - Voltar \n");

    System.out.print("\n> Digite o número da opção desejada: ");
  }

  public void showCodesExercisesMenu() {
      System.out.println("\n+-------------------------------------+");
      System.out.println("|   Códigos de exercícios propostos   |");
      System.out.println("|-------------------------------------|");
      for (int iterator =0; iterator < this.codeExercisesNames.size(); iterator++) {
        System.out.printf("| %d - %s \n", iterator + 1, this.codeExercisesNames.get(iterator));
      };
      System.out.print("| 0 - Voltar \n");

      System.out.print("\n> Digite o número da opção desejada: ");
  }

  public void showExerciseCodeInformation(String codeName) {
    String codeDirectory = codeName;

    if (subDirectoriesClass.containsKey(codeName)) {
      codeDirectory = subDirectoriesClass.get(codeName) + codeName;
    }

    System.out.println("\nInicializando " + codeName + " ...");
    System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/main/java/files/ExercisesCode/%s\n", codeDirectory);

    subDirectoriesClass.clear();
  }

  public void showClassCodeInformation(String codeName) {
    String codeDirectory = codeName;

    if (subDirectoriesClass.containsKey(codeName)) {
      codeDirectory = subDirectoriesClass.get(codeName) + codeName;
    }

    System.out.println("\nInicializando " + codeName + " ...");
    System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/main/java/files/AulasCode/%s\n", codeDirectory);

    subDirectoriesClass.clear();
  }
}
