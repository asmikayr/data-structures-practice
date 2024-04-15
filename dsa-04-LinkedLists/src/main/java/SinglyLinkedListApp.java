public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLikedList myList = new MySinglyLikedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.printNodes();
        myList.deleteById(8);
        myList.printNodes();
        myList.addFirst(50);
        myList.printNodes();
        System.out.println(myList.indexOf(1));

    }
}
