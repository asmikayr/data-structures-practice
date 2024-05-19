package LargestRange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static void main(String[] args) {
        int [] myArray=new int[]{6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(largestRange(myArray)));
    }
    public static int[] largestRange(int[] array) {
      // create a return type array for best range (start,end)
        int[] result = new int[2];
        // a variable for longest range
        int longestRangeLength=0;
       // create a map for used elements integer-boolean , true means not visited yet
        Map<Integer,Boolean> numsMap = new HashMap<>();
        // put elements in hashmap with true
        for (Integer i: array
             ) {
            numsMap.put(i,true);

        }
        // make a for loop inside do following
        for(int i: array){
            // if current element is used continue to next
            if(!numsMap.get(i)) continue;
            // reset current length, left index and right index
            int currentLength=1;
            int right=i+1;
            int left=i-1;
            numsMap.put(i,false);
            // if right index is in map - put false, inc currlength, go right++
            while(numsMap.containsKey(right)){
                numsMap.put(right,false);
                currentLength++;
                right++;
            }
            // if left index is in map - put false, inc currlength, go left--
            while(numsMap.containsKey(left)){
                numsMap.put(left,false);
                currentLength++;
                left++;
            }
            // compare currLength with longest range if curr>longest bestRange Start=left+1, End=right-1
            if(currentLength>longestRangeLength){
                longestRangeLength=currentLength;
                result=new int[]{left+1,right-1};
            }
        }
       // return bestRange

       return result;
    }
}
