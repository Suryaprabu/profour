package prog.four.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupeForArray {

	public static void main(String[] args) {
     int []a= {10,20,15,10,15,60};
     Set<Integer>s=new LinkedHashSet<>();
     for (int i=0;i<a.length;i++) {
    	 s.add(a[i]);
		
	}
     System.out.println(s);
	}

}
