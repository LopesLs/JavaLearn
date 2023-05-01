package files.AulasCode.Orders;

public class Order {

	// Attributes
	String client = "";
	String products = "";
  String address = "";
	boolean status = false;
	int quantity = 0;
	double value = 0;
	
	// Constructor
	public Order(String client, String address) {
		this.client = client;
		this.address = address;
		this.status = true;
	}
	
	// Method void without return
	public void insertProduct(String product, double value, int quantity) {
		if(this.products == "") {
			this.products = product;
		}else {
			this.products += ", " + product;
		}
		
		this.value += value * quantity;
	}	
	
  // Method void without return for show description
	public void printOrder() {
    System.out.println("\nDescrição do Pedido: \n");
    System.out.println("Cliente: " + this.client);
    System.out.println("Endereço: " + this.address);
    System.out.println("Produtos: " + this.products);
    System.out.println("Valor Total: " + this.value);
  }
}



