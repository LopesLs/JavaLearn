package files;
import java.util.Scanner;

// Importing files
import files.AulasCode.*;
import files.ExercisesCode.*;

// Importing subdirectories
import files.AulasCode.InputExample.ExemploInput;
import files.AulasCode.Orders.OrderApp;
import files.ExercisesCode.MediaAluno.AlunoApp;
import files.AulasCode.Bank.BankAccountApp;
import files.ExercisesCode.ImcApp.ImcSoftware;

public class App{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    SoftwareMethods methods = new SoftwareMethods();

    System.out.println("\nBem vindo ao meu repositório de exercícios de Java!");

    while(true) {
      methods.showStartMenu();
      int option = input.nextInt();
  
      switch (option) {
        case 1:
          methods.showCodesMenu(0);
          option = input.nextInt();

          try {
            if (option == 0) {break;} else {methods.showCodeInformation(methods.codeClassNames.get(option - 1), 0);}
            
            // Switch case to call the class that the user wants to see
            switch (option) {
              
              case 1:
                ExemploInput.main(args, input);
                break;
              
              case 2:
                Introduction.main(args);
                break;
              
              case 3:
                Loops.main(args);
                break;
              
              case 4:
                PrimitivoVsObjeto.main(args);
                break;
              
              case 5:
                OrderApp.main(args);
                break;
              
              case 6:
                BankAccountApp.main(args);
                break;
            }
  
          } catch (Exception e) {
            System.out.println(e);
          }
  
          break;
  
      case 2:
        methods.showCodesMenu(1);
        option = input.nextInt();
  
        try {
          if (option == 0) {break;} else {methods.showCodeInformation(methods.codeExercisesNames.get(option-1), 1);}
          
          // Switch case to call the class that the user wants to see
          switch (option) {
            case 1:
              Apple.main(args, input);
              break;           
            case 2:
              Wage.main(args, input);
              break;       
            case 3:
              Biggestandsmallest.main(args, input);
              break; 
            case 4:
              AlunoApp.main(args);
              break;
            case 5:
              ImcSoftware.main(args, input);
              break;
            case 6:
              Worker.main(args);
              break;
            case 7:
              Inheritance.main(args);
              break;
            case 8:
              PlayerApp.main(args, input);
              break;
          }
  
        } catch (Exception e) {
          System.out.println(e);
        }
        
        break;
      
      case 3:
        System.out.println("\nObrigado por usar meu repositório de exercícios, volte sempre ^^\n");
        input.close();
        System.exit(0);
        break;
  
      default:
        System.out.println("\nOpção inválida!");
        break;
      }  
    }
  }
}