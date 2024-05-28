public class ReferenceTypeTestApp {

    public static void main(String[] args) {
        Person person1 = new Person("Michael", new Car("Audi", "A4"));
        Person person2 = new Person("MichaelNext", new Car("BMW", "3 series"));
       person1.next = person2;
        System.out.println(person1.next);
        System.out.println(person2);
        Person current = person2;
        System.out.println(current);
    }
}
