package firstlesson;

import java.util.Scanner;

public class Input {
	private String a;

	public void input() {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Koks tavo vardas? ");
		a = reader.nextLine();
		System.out.println("Hello " + a + "!");

	}

}