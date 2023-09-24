package files;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		FileDemonstration application = new FileDemonstration();
		
		System.out.println("Enter file or directory name here: ");
		application.analyzepath( input.nextLine() );

	}

}
