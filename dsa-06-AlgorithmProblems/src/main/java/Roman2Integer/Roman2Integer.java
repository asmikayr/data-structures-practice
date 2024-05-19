package Roman2Integer;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public static void main(String[] args) {
        System.out.println(romanToInteger("CMXCIV"));
    }

    static int romanToInteger(String s) {
        // ("M", 1000); ("D", 500);("C", 100);("L", 50);("X", 10);("V", 5);("I", 1);
        // Create Map for Roman Numerals <String, Integer>
        Map<String,Integer> values = new HashMap<>();
        values.put("M",1000);
        values.put("D",500);
        values.put("C",100);
        values.put("L",50);
        values.put("X",10);
        values.put("V",5);
        values.put("I",1);

        // create variables for sum, index
        int sum = 0;
        int index =0;
        // while loop until index reaches end of string
        while(index<s.length()){
            String currentSymbol=s.substring(index,index+1);
            int currentValue=values.get(currentSymbol);
            int nextValue=0;
            if(index+1<s.length()){
                String nextSymbol=s.substring(index+1,index+2);
                nextValue=values.get(nextSymbol);
            }
            if(currentValue<nextValue){
                sum+=nextValue-currentValue;
                index+=2;
            }
            else{
                sum+=currentValue;
                index++;
            }
        }
        return sum;
    }
}
