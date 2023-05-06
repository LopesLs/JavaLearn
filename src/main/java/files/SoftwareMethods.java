package files;
import java.util.HashMap;

public class SoftwareMethods {
  String[] codeClassNames = {"ExemploInput.java", "Introduction.java", "Loops.java", "PrimitivoVsObjeto.java", "OrderApp.java", "BankAccountApp.java"};
  String[] codeExercisesNames = {"Apple.java", "Wage.java", "Biggestandsmallest.java", "AlunoApp.java", "Imc.java", "Worker.java", "Inheritance.java", "PlayerApp.java"};

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

  public void showCodesMenu(int menuType) {
    if (menuType == 0) {
      System.out.println("\n+-------------------------------------+");
      System.out.println("|    Códigos feitos em sala de aula   |");
      System.out.println("+-------------------------------------+");
      for (int iterator = 0; iterator < this.codeClassNames.length; iterator++) {
        System.out.printf("| %d - %s \n", iterator + 1, this.codeClassNames[iterator]);
      }

      System.out.print("\n> Digite o número da opção desejada: ");

    } else if (menuType == 1) {
      System.out.println("\n+-------------------------------------+");
      System.out.println("|   Códigos de exercícios propostos   |");
      System.out.println("|-------------------------------------|");
      for (int iterator =0; iterator < this.codeExercisesNames.length; iterator++) {
        System.out.printf("| %d - %s \n", iterator + 1, this.codeExercisesNames[iterator]);
      };

      System.out.print("\n> Digite o número da opção desejada: ");
    }
  }

  public void showCodeInformation(String codeName, int menuType) {
    String codeDirectory = codeName;
    subDirectoriesClass.put("AlunoApp.java", "MediaAluno/");
    subDirectoriesClass.put("BankAccountApp.java", "Bank/");
    subDirectoriesClass.put("ExemploInput.java", "InputExample/");
    subDirectoriesClass.put("OrderApp.java", "Orders/");

    if (subDirectoriesClass.containsKey(codeName)) {
      codeDirectory = subDirectoriesClass.get(codeName) + codeName;
    }

    switch (menuType) {
      case 0:
        System.out.println("\nInicializando " + codeName + " ...");
        System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/main/java/files/AulasCode/%s\n", codeDirectory);
        break;
      
      case 1:
        System.out.println("\nInicializando " + codeName + " ...");
        System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/main/java/files/ExercisesCode/%s\n", codeDirectory);
        break;
      
      default:
        System.out.println("\nOpção inválida!");
        break;
    }

    subDirectoriesClass.clear();
  }
}
