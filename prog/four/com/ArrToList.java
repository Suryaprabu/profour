package prog.four.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrToList {

	public static void main(String[] args) {
    Integer []a= {10,20,30,40,20};
    List<Integer> li=new LinkedList<>(Arrays.asList(a));
    li.add(30);
    li.add(60);
    int value=0;

for (int i = li.size(); i >=0; i++) {
	value = li.get(li.size()-1);
	System.out.println("Index Number: "+i+" : "+value);
}    
    //    int lastIndexOf = li.lastIndexOf(60);
    System.out.println(value);
    

    
	}

}
