package staticDemo;

public class ProductManager {
	//ProductValidator productValidator = new ProductValidator();
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("eklenemedi");
		}
	}
}
