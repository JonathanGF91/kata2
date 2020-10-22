
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonathan
 */
public class Histogram {
    
    private Map <Integer, Integer> map = new HashMap<>();
    private Integer[] array;
        
    public Histogram (Integer[] array){
        this.array = array;
        fillMap(array);
    }
    
    private void fillMap (Integer[] array){
        
        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.replace(array[i], map.get(array[i]) + 1);
            }else{
                map.put(array[i], 1);
            }
        }
    }
    
    @Override
    public String toString(){
        
        String mapString = "key --- Rep\n";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            mapString += entry.getKey() + " --- " + entry.getValue() + "\n";
        }       
        return mapString;
    }
}
