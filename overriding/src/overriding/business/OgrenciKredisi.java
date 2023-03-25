package overriding.business;

public class OgrenciKredisi extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar*1.10;
	}
}
