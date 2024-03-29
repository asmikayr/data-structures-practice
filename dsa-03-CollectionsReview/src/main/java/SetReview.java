import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set

        Set<Student> set = new HashSet<>();

        //2. add element

        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4,"Mary"));

        System.out.println(set);
        System.out.println(firstRepeatingChar("Javva Developer"));


    }

    public static Character firstRepeatingChar(String str){
        //What is the time complexity of the following? O(n)

        //create a hashset
        Set<Character> chars=new HashSet<>();//in here I have space Complexity of O (n)
        //iterate over the char array and add chars into hashSet
        for(Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
        //if add ops is false return that char
        return null;
    }
}
