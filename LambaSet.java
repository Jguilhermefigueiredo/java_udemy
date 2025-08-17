import java.util.*;
import java.util.Arrays;


public class LambaSet {
    public static void main (String[] args){
        Set<Integer> numerosObj = new HashSet<>(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}));
        //Set<Integer> numerosimparesObj = new HashSet<>();
        numerosObj.removeIf(impar -> impar % 2 == 0);    
        System.out.println(numerosObj);
    }

}
