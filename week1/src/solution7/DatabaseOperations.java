package solution7;

public class DatabaseOperations {
	
	public void open() {
		System.out.println("Database Connection State: Open!!");
	}
	
	public Report runQuery(String Q) {
		
		System.out.println("Query Result: .... ");
		
		return new Report();
		
	}

}
