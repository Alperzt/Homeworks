
public class SayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = new int[] {1,2,5,7,9};
		int aranacak = 7;
		int counter = 0;
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				counter++;
			}
		}
		if(counter > 0) {
			System.out.println("mevcut");
		}
		else {
			System.out.println("mevcut değil");
		}
	}

}
