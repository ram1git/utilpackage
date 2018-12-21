package utilpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class utillearn {
	
	@Test
	public void arraytest1(){
		
		List<String>l=new ArrayList<String>();
		l.add("ananth");
		l.add("kavitha");
		l.add("abhiram");
		
		System.out.println(l);
		
		
	}
	
	
	@Test
	
	
	public void linkedlist(){
		
	List<String> l2=new LinkedList<String>();	
	
	l2.add("ananth");
	l2.add("kavitha");
	l2.add("abhiram");
	
System.out.println(l2);
		
	}

}
