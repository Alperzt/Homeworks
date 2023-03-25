package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "";
		product1.price = 123; 
		productManager.add(product1);

	}

}
