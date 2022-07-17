package singletonPattern.case1.step1;

public class Database {
	private static Database singleton;
	private String name;

	private Database(String name) {
//		super();
//		this.name = name;
		
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}
	
	public static Database getInstance(String name) {
		if (singleton == null) {
			singleton = new Database(name);
		}
		return singleton;
	}

	public String getName() {
		return name;
	}
	
	 
}
