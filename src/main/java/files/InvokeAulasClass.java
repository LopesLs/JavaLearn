package files;
import java.util.Scanner;

// Importing files
import files.AulasCode.*;

// Importing subdirectories
import files.AulasCode.InputExample.ExemploInput;
import files.AulasCode.Orders.OrderApp;
import files.AulasCode.Bank.BankAccountApp;

public class InvokeAulasClass {

  public static void call(String[] args, Scanner scanner, int option) {
    switch (option) {       
      case 1:
        ExemploInput.main(args, scanner);
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
  }
}