import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type something: ");
		String a = reader.nextLine();	
		System.out.println("You typed: " + a);	
}
}
