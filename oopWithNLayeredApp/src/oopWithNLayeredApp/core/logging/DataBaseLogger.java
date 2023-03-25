package oopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Veri tabanına loglandı : " + data);
	}

}
