package homeworkOOPWebsiteDemo.logging;

public class DataBaseLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Database'e loglandı : " + data);		
	}
	
}
