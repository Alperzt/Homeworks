package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		String metin = "Yazılım öğreniyorum";
		System.out.println("mesajın uzunluğu " + metin.length());
		System.out.println("mesajın 8. karakteri " + metin.charAt(0));
		String metinConcat = metin.concat("505");                       //metin birleştirme
		System.out.println(metinConcat);
		System.out.println(metinConcat.endsWith("0"));                  //biten karakter kontrolü
		System.out.println(metinConcat.startsWith("Y"));				//başlayan karakter kontrolü
		char[] karakter = new char[5];
		
		metinConcat.getChars(19,metinConcat.length(), karakter, 0);		//karakterleri al ve başka bir yere ata		
		System.out.println(karakter);
		System.out.println(metinConcat.indexOf("5"));					//ilk baştan başlayarak 5 ara
		System.out.println(metinConcat.lastIndexOf("5"));				// sondan başlayarak 5 ara
	
	 
	    String mesaj = "          Arctic Monkeys 505         ";
	    String yeniMesaj = mesaj.replace(" ", "-");
	    System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(0, 4));
	    for(String kelime : yeniMesaj.split("-")) {
	    	System.out.println(kelime);
	    }
	    
	    System.out.println(yeniMesaj.toUpperCase());
	    System.out.println(yeniMesaj.toLowerCase());
	    System.out.println(mesaj.trim());
	    
	    
	    int number = 2;
	    int remainder = 0;
	    
	    for(int i = 1; i<= number ;i++) {
	    	if(number%i == 0) {
	    		remainder++;
	    	}
	    }
	    
	    if(remainder <= 2) {
	    	System.out.println("asal");
	    }
	    else {
	    	System.out.println("değil");
	    }
	
	}

}
 