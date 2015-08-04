import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		int a;
			 
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Enter a number");
		a = in.nextInt();
		
		if (a % 10 == 3)
			System.out.println("Boom");
		else if (a % 10 == 7)
			System.out.println("Pam");
		else if (a % 10 == 9)
			System.out.println("Else");
	}
    
}
