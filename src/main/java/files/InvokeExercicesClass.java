package files;
import java.util.Scanner;
// Importing files
import files.ExercisesCode.*;

// Importing subdirectories
import files.ExercisesCode.MediaAluno.AlunoApp;
import files.ExercisesCode.ImcApp.ImcSoftware;

public class InvokeExercicesClass extends InvokeAulasClass {

  public static void call(String[] args, Scanner scanner, int option) {
    switch (option) {
      case 1:
        Apple.main(args, scanner);
        break;               
      case 2:
        Wage.main(args, scanner);
        break;       
      case 3:
        Biggestandsmallest.main(args, scanner);
        break; 
      case 4:
        AlunoApp.main(args);
        break;
      case 5:
        ImcSoftware.main(args, scanner);
        break;
      case 6:
        Worker.main(args);
        break;
      case 7:
        Inheritance.main(args);
        break;
      case 8:
        PlayerApp.main(args, scanner);
        break;
    }
  }
}
