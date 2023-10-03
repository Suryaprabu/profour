package prog.four.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemFromStr {

	public static void main(String[] args) {
     String s ="Surya fight with Jaya Surya";
     String[] s1 = s.split(" ");
     Set<String> s2=new LinkedHashSet<>();
     for (String string : s1) {
    	 s2.add(string);
    	 
		
	}
     System.out.println(s2);
	}

}
