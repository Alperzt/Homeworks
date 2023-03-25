package intro;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 6;
		int counter = 0;
		for(int i = 1;i<number;i++) {
			if(number%i == 0) {
				counter = counter + i;
			}
		}
		if(counter == number) {
			System.out.println("mükemmel sayı");
		}
		else {
			System.out.println("değil");
		}
		
		
	}
}
