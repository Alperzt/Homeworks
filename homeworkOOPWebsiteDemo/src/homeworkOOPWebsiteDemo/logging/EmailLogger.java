package homeworkOOPWebsiteDemo.logging;

public class EmailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("E-mail'e loglandı : " + data);		
	}
	
}
