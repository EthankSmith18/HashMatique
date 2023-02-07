import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class Band {

  public static void main(String[] args) {  
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Rocker", "Gokhan is a Rocker");
    trackList.put("BigGuy", "Gokhan is a BigGuy");
    trackList.put("Duck", "Gokhan is a Duck");
    trackList.put("Bird", "Gokhan is a Bird");


    Set<String> keys = trackList.keySet();
    for(String key : keys){
      System.out.println(key);
      System.out.println(trackList.get(key));
      System.out.println(trackList.get("Duck"));
    }

  }

}
