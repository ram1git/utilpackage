package utilpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

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
	
	@Test(priority=6)
	
	public void hashtabeltest6(){
		
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("username-password1", "ananth1-ananth1@yahoo.com");
		hm.put("username-password2", "ananth2-ananth1@yahoo.com");
		hm.put("username-password3", "ananth3-ananth1@yahoo.com");
		hm.put("username-password4", "ananth4-ananth1@yahoo.com");
		hm.put("username-password5", "ananth5-ananth1@yahoo.com");
		hm.put("username-password6", "ananth6-ananth1@yahoo.com");
		hm.put("username-password7", "ananth7-ananth1@yahoo.com");
		hm.put("username-password8", "ananth8-ananth1@yahoo.com");
		hm.put("username-password9", "ananth9-ananth1@yahoo.com");
		hm.put("username-password10", "ananth10-ananth1@yahoo.com");
		hm.put("username-password11", "ananth11-ananth1@yahoo.com");
		
		System.out.println(hm);
		
	System.out.println(hm.get("username-password1"));
	
	
	for(int i=0;i<hm.size();i++){
		
Collection<String>co=hm.values();
java.util.Iterator<String> it=co.iterator();
String name=it.next();
String[] names=name.split("-");
System.out.println(names[0]);
System.out.println(names[1]);

System.out.println("hello");

		
	}
		
	}
	
	
	
	@Test(priority=7)
	
	
	public void test7(){
		
	Map<String,String>map=new HashMap<String,String>();	
	map.put("india", "delhi");
	map.put("karnataka", "delhi1");
	map.put("india", "bangalore");
	map.put("orissa", "bhubaneshwar");
	map.put("tamilnadu", "chennai");
	map.put("uttar pradesh", "lucknow");
	map.put("madhya pradesh", "bhopal");
	map.put("west bengal", "kolkatta");
	map.put("gujurath", "ahmedabad");
	map.put("telengana", "hyderabad");
	map.put("andhra pradesh", "amaravathi");
	
	System.out.println(map);
	
Set<String>s=map.keySet();
java.util.Iterator<String> ig=s.iterator();

while(ig.hasNext()){
System.out.println(ig.next());
}

	
}
	
		
	}
	
	


