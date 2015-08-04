import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Enter a number");
		String s = in.next();
	

		String regex = "3";
		String buzzer = "Bum";

		Pattern p = Pattern.compile(regex);
		
		String HasMatch = matchesPattern(p,s,buzzer);
		
		if(HasMatch != null)
			System.out.println(HasMatch);		
	}
   
	private static String matchesPattern(Pattern p,String s, String buzzer) {
	     Matcher m = p.matcher(s);

	     if (m.find()) {
	       return buzzer;
	     }

	     return null;
	   }
    
}
