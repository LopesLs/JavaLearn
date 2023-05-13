package files;
import java.util.Scanner;

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
          methods.showCodesClassMenu();
          option = input.nextInt();

          try {
            if (option == 0) {break;} else {methods.showClassCodeInformation(methods.codeClassNames.get(option-1));}
            
            InvokeAulasClass.call(args, input, option);
            
          } catch (Exception e) {
            System.out.println(e);
          }
  
          break;
  
      case 2:
        methods.showCodesExercisesMenu();
        option = input.nextInt();
  
        try {
          if (option == 0) {break;} else {methods.showExerciseCodeInformation(methods.codeExercisesNames.get(option-1));}
          
          InvokeExercicesClass.call(args, input, option);
  
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