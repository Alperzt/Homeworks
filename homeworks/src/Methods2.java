
public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi = topla(4,3);
		System.out.println(sayi);
		int toplam = topla2(1,2,3,250,22,18,47,21);
		System.out.println(toplam);
	}
	public static void ekle(){
		System.out.println("eklendi");
	}
	public static void sil(){
		System.out.println("silindi");
	}
	public static void guncelle(){
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2){
		return sayi1+sayi2 ;	
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam+sayi;
		}
		return toplam;
	}
}
