package prog.four.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class COWord {

	public static void main(String[] args) {
String s="chennai super kings chennai";
String[] a = s.split(" ");
Map<String,Integer>m=new LinkedHashMap<>();
for (String b : a) {
	if (m.containsKey(b)) {
		Integer i = m.get(b);
		m.put(b, 1+i);
	}
	else {
		m.put(b, 1);
	}
	
}System.out.println(m);
	}

}
