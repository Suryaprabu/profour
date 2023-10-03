package prog.four.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class COLetter {

	public static void main(String[] args) {
		String s = "jayaSuryaPrabu";
		char[] e = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (Character a:e) {
			if (m.containsKey(a)) {
				Integer i = m.get(a);
				m.put(a,1+i);

			} else {
				m.put(a, 1);
			}
			
		}
		System.out.println(m);


	}

}
