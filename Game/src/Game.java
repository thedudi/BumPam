import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Enter a number");
		String s = in.next();
	

	    Set<String> regex_set = new HashSet<String>();
	    regex_set.add("3,Bum");
	    regex_set.add("7,Pam");
	     	
			
	    for (String regex_pattern : regex_set) {
	    	String[] parts = regex_pattern.split(","); 		
		 	Pattern p = Pattern.compile(parts[0]);
		 	String buzzer = parts[1];
		 	
			String HasMatch = matchesPattern(p,s,buzzer);
				
			if(HasMatch != null)
				System.out.println(HasMatch);
			}	     	
	}
   
	private static String matchesPattern(Pattern p,String s, String buzzer) {
	     Matcher m = p.matcher(s);

	     if (m.find()) {
	       return buzzer;
	     }

	     return null;
	   }
    
}
