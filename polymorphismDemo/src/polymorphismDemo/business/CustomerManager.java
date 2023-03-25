package polymorphismDemo.business;

import polymorphismDemo.Logger.BaseLogger;

public class CustomerManager {
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Eklendi");
		baseLogger.log("Log mesajı");
		
	}

}
