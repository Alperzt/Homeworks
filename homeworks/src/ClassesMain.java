
public class ClassesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);
		
		ProductHomework product1 = new ProductHomework("laptop","Monster Notebook",7000,3,"23412321");
		ProductHomework product = new ProductHomework();
		product.setName("Laptop");
		product.setId("1");;
		product.setDesription("Monster");
		product.setPrice(1200);
		product.setStockUnit(80);
		System.out.println(product.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKredisi());
		krediUI.KrediHesapla(new TarımKredisi());
	}

}

