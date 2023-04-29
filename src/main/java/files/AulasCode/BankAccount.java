// Description: Classe que simula uma conta bancária.

package files.AulasCode;

public class BankAccount {
  private String client;
  private String accountNumber;
  private String agency;

  // Construtor
  public BankAccount(String client) {
    this.client = client;
  }

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }
}