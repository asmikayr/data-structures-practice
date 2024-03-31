package Day_02_Review_Collection;

import java.util.HashMap;

public class GenerateDocumentProblem {
    public static void main(String[] args) {
        String list="!veDJaCyd vaeo perelo xw";
        String document="Cydeo Java Develo";

        System.out.println(generateDocumentBruteForce(list, document));
        System.out.println(generateDocumentOptimal(list, document));

    }

    public static boolean generateDocumentBruteForce(String list, String document){
        for (int i = 0; i < document.length(); i++) {
            char character=document.charAt(i);
            int documentCharFrequency = countCharFrequency(character, document);
            int charListFrequency=countCharFrequency(character, list);

            if(documentCharFrequency>charListFrequency) return false;

        }

        return true;
    }

    public static int countCharFrequency(Character character, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(character==str.charAt(i)) count++;

        }
        return count;
    }

    public static boolean generateDocumentOptimal(String list, String document){
        //create HashMap(char, int)
        HashMap<Character, Integer> charCount = new HashMap<>();
        //for loop iterate and count chars in the list
        for (int i = 0; i < list.length(); i++) {
            char ch = list.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);

        }
        //iterate doc string and update char freq from hashmap

        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            if(!charCount.containsKey(ch) || charCount.get(ch)==0) return false;
            charCount.put(ch,charCount.get(ch)-1);
        }

        //return true if prev loop is completed without false
        return true;

    }
}
