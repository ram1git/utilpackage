package utilpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class utillearn {
	
	@Test(priority=1)
	public void arraytest1(){
		
		List<String>l=new ArrayList<String>();
		l.add("ananth");
		l.add("kavitha");
		l.add("abhiram");
		
		System.out.println(l);
		
		
	}
	
	
	@Test(priority=2)
	
	
	public void linkedlist(){
		
	List<String> l2=new LinkedList<String>();	
	
	l2.add("ananth");
	l2.add("kavitha");
	l2.add("abhiram");
	
System.out.println(l2);
		
	}
	
	
	
	@Test(priority=3)
	
	
	public void hashSet(){
		
		Set<String>set=new HashSet<String>();
		set.add("ajmer");
		set.add("delhi");
		set.add("alampur");
		set.add("aligarh");
		set.add("bangalore");
		set.add("cement nagar");
		set.add("chennai");
		
		
		HashSet<String>set1=new HashSet<String>();
		
		set1.add("ajmer1");
		set1.add("delhi1");
		set1.add("alampur1");
		set1.add("aligarh1");
		set1.add("bangalore1");
		set1.add("cement nagar1");
		set1.add("chennai1");
		
		
		set.addAll(set1);
		
		System.out.println("the value of set is -----"+set);
		
		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();
		
		set2.add("ajmer");
		set2.add("delhi");
		set2.add("alampur");
		set2.add("aligarh");
		set2.add("bangalore");
		set2.add("cement nagar");
		set2.add("chennai");
		
		LinkedHashSet<String> set3=new LinkedHashSet<String>();
		
		
		set3.add("ajmer1");
		set3.add("delhi1");
		set3.add("alampur1");
		set3.add("aligarh1");
		set3.add("bangalore1");
		set3.add("cement nagar1");
		set3.add("chennai1");
		
		
		set2.addAll(set3);
		
		System.out.println(set2);
		
		
		
		
		}
		
		
	
	@Test(priority=5)
	
	public void treeset(){
		
		TreeSet<String>set2=new TreeSet<String>();
		set2.add("ajmer");
		set2.add("delhi");
		set2.add("alampur");
		set2.add("aligarh");
		set2.add("bangalore");
		set2.add("cement nagar");
		set2.add("chennai");
		
		
		System.out.println("sorted tree set is ---"+set2);
		
		
		
		TreeSet<String>set3=new TreeSet<String>();
		set3.add("ajmer1");
		set3.add("delhi1");
		set3.add("alampur1");
		set3.add("aligarh1");
		set3.add("bangalore1");
		set3.add("cement nagar1");
		set3.add("chennai1");
		
		set2.addAll(set3);
		
		System.out.println("sorted tree set is ---"+set2);
		
		
	}
	}


