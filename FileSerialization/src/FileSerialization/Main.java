package FileSerialization;

public class Main {

	public static void main(String[] args) {
//		CreateSequentialFile application = new CreateSequentialFile();
//		
//		application.openFile();
//		application.addRecords();
//		application.closeFile();
		
		ReadSquentialFile application2 = new ReadSquentialFile();
		application2.openFile();
		application2.readRecords();
		application2.closeFile();
		
	}

}
