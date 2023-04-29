package files.AulasCode;

public class BankAccountApp {
  public static void main(String[] args) {
    BankAccount account01 = new BankAccount("John Doe");
    account01.setAccountNumber("123456");
    System.out.println(account01.getAccountNumber());
  }
}
