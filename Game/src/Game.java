import java.util.Scanner;
import java.util.regex.Matcher;

public class Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Enter a number");
		String s = in.next();
		
		if (s.contains("3"))		
			System.out.println("Boom");
		else if (s.contains("7"))
			System.out.println("Pam");
		else if (s.contains("9"))
			System.out.println("Else");
	}
    
}
