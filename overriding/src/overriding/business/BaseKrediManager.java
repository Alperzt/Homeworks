package overriding.business;

public class BaseKrediManager {
	public double hesapla(double tutar) { // override ı durdurmak için public yanına final yaz
		return tutar*1.18;
	}
}
