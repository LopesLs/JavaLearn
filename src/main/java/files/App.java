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
            methods.showCodeInformation(methods.codeClassNames[option - 1], 0);
  
            switch (option - 1) {
              case 0:
                ExemploInput.main(args, input);
                break;
              
              case 1:
                Introduction.main(args);
                break;
              
              case 2:
                Loops.main(args);
                break;
              
              case 3:
                PrimitivoVsObjeto.main(args);
                break;
              
              case 4:
                OrderApp.main(args);
                break;
              
              case 5:
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
          methods.showCodeInformation(methods.codeExercisesNames[option - 1], 1);
  
          switch (option - 1) {
            case 0:
              Apple.main(args, input);
              break;
            
            case 1:
              Wage.main(args, input);
              break;
            
            case 2:
              Biggestandsmallest.main(args, input);
              break;
            
            case 3:
              AlunoApp.main(args);
              break;
            
            case 4:
              Imc.main(args, input);
              break;
            case 5:
              Worker.main(args);
              break;
            case 6:
              Inheritance.main(args);
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