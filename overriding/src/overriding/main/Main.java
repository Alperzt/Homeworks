package overriding.main;

import overriding.business.BaseKrediManager;
import overriding.business.OgrenciKredisi;
import overriding.business.OgretmenKrediManager;
import overriding.business.TarimKrediManager;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKredisi()};
		for(BaseKrediManager krediManager : baseKrediManagers) {
			System.out.println(krediManager.hesapla(100000));
		}
	}

}
