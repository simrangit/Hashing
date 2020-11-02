import java.util.*;

public class Hash_Set {
	
	public static void main(String args[])
	{
		HashSet<String> h = new HashSet<String>(); 
		  
        // Adding elements into HashSet using add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India"); 
        h.add("India");// does not allow duplicate elements
        h.add(null);
        h.add(null);
        h.add("Canada");
        
        if(h.add("USA") == false)
        {
        	System.out.println("Already added in set");
        }
        
        System.out.println(h);
        
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
        
	}

}
