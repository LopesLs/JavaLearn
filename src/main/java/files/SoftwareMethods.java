package files;

public class SoftwareMethods {
  String[] codeClassNames = {"ExemploInput.java", "Introduction.java", "Loops.java", "PrimitivoVsObjeto.java", "OrderApp.java"};
  String[] codeExercisesNames = {"Apple.java", "Wage.java", "Biggestandsmallest.java", "AlunoApp.java", "Imc.java"};
  
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

  public void showCodeInformation(String code, int menuType) {
    switch (menuType) {
      case 0:
        System.out.println("\n\nInicializando " + code + " ...");
        System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/AulasCode/%s\n\n", code);
        break;
      
      case 1:
        System.out.println("\n\nInicializando " + code + " ...");
        System.out.printf("Código fonte em: https://github.com/LopesLs/JavaLearn/blob/main/src/ExercisesCode/%s\n\n", code);
        break;
      
      default:
        System.out.println("\n\nOpção inválida!");
        break;
    }
  }
}
