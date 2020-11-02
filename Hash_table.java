import java.util.*;

public class Hash_table {
	
	public static void main(String args[])
	{
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(1, "Germany");
		ht.put(2,"India");
		ht.put(3,"Canada");
		ht.put(4, "USA");
		ht.put(5, "USA"); // can have duplicate values for multiple keys
		ht.put(3, "England"); // cannot have duplicate keys
//		ht.put(5, null); // cannot insert null in hash_table - neither keys nor values
//		ht.put(null, "England"); // will throw null pointer exception
		
		System.out.println("Print Hash Table "+ht);
		
		String s = ht.get(1);
		
		ht.put(1, s);
		
		Set set = ht.entrySet(); 
		
		System.out.println("Print Hash Table "+set.size());
	}
}
