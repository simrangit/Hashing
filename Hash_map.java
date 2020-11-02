import java.util.HashMap;

public class Hash_map {
  public static void main(String[] args) {
    HashMap<String, String> hm = new HashMap<String, String>();
    
    hm.put("England", "London");
    hm.put("Germany", "Berlin");
    hm.put("Norway", "Oslo");
    hm.put("USA", "Washington DC");
    hm.put(null,null);
    hm.put(null,"abc");
    hm.put("India",null);
    hm.put("Canada", "Vancouver");
    hm.put("CA", "Vancouver");

    hm.put("Europe", " Oslo");
    
    System.out.println(hm); 
    
    if(hm.containsKey("Germany"))
    {
    	System.out.println("Present "+hm.entrySet());
    }
  }
}
