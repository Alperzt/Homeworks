
public class ProductHomework {
	public ProductHomework() {
		
	}
	
	public ProductHomework(String name,String description, double price, int stockUnit,String id) {
		System.out.println("yapıcı blok çalıştı");
		this.name = name;
		this.desription = description;
		this.price = price;
		this.stockUnit = stockUnit;
		this.id = id;
		
	}
	private String name;
	private String desription;
	private double price;
	private int stockUnit;
	private String id;
	private String kod;
	
	public String getKod() {
		return name.substring(0,1)+id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockUnit() {
		return stockUnit;
	}
	public void setStockUnit(int stockUnit) {
		this.stockUnit = stockUnit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
