package UniqueNumberOfOcurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        //int [] myArray=new int[]{1,2,2,1,1,3};
        int [] myArray=new int[]{1,2};
        System.out.println(uniqueOccurrences(myArray));
    }
    public static boolean uniqueOccurrences(int[] arr){
        // create a hashmap (Integer,Integer) (Elements, Freq.)
        Map<Integer,Integer> freq = new HashMap<>();

        // count number of occurences and put them in map
        for (int i: arr) {
            freq.put(i,freq.getOrDefault(i,0)+1);

        }

        // put the frequencies in a set find if there are any duplicated values
        Set<Integer> freqSet = new HashSet<>();
        // There are no duplicates , frequencies are unique..Then return true
        for(Integer value: freq.values()){
            if(!freqSet.add(value)) return false;
        }
       return true;
    }
}
