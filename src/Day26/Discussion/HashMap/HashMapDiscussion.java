
package Day26.Discussion.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class HashMapDiscussion {
    
    public static void main(String[] args) {
        
        Map<String, String> config = new HashMap<>();  
        config.put("dburl", "https://localhost:3306/mydb");
        config.put("maxConnection", "50");
        config.put("appUrl", "https://hp4kmcgkrj.execute-api.us-east-2.amazonaws.com/production");
        
       
        if (config.containsKey("appUrl")) {
          System.out.println("Application is already hosted to AWS");
        }
        
        config.clear();
        
        Set<String> keys = config.keySet();
        for (String key : keys) {
            System.out.println(key);
            }
        
        Collection <String> configValues = config.values();
        for(String configValue : configValues) {
            System.out.println(configValue);
        }
    }
}
