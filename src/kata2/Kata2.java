package kata2;

/**
 *
 * @author Jonathan
 */
public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] array = {5, 6, 8, 1, 5, 5, 7, 3, 9, 1};
        Histogram histogram = new Histogram(array);
        
        System.out.println(histogram.toString());
    }
    
}
