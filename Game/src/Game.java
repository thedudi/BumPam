import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Enter a number");
		String s = in.next();
	
	    HashMap<String,String> regex_map = new HashMap<String,String>();
	    regex_map.put("3","Bum");
	    regex_map.put("7","Pam");
	    // ...
	    // ...
	    // Additional regex pattern can be added
	    // in the format of regex_map.put("<REGEX PATTERN>",<"BAZZER">);

	    Iterator<String> keySetIterator = regex_map.keySet().iterator();
	    while(keySetIterator.hasNext())
	    {
	    	String key = keySetIterator.next();
	    	String value = regex_map.get(key);
	    	
	    	Pattern p = Pattern.compile(key);
		 	
			if(matchesPattern(p,s))
				System.out.println(value);
			}
	}
   
	private static boolean matchesPattern(Pattern p,String s) {
			return p.matcher(s).find();
	    }    
}
