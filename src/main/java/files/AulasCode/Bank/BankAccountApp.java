package files.AulasCode.Bank;

public class BankAccountApp {
  public static void main(String[] args) {
    // Introduzindo o programa para o usuário
    System.out.println("\n> BankAccountApp.java");


    BankAccount account01 = new BankAccount("John Doe");
    account01.setAccountNumber("\nNúmero da conta: 12345");
    System.out.println(account01.getAccountNumber());
  }
}
