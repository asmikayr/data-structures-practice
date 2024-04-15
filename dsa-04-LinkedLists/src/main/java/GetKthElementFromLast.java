public class GetKthElementFromLast {
    Node head;
    Node tail;
    int size;

    public int getKthFromLast(int k){
    // write your code here


        Node p1 = head;
        Node p2 = head;

        int count = 0;

        while(count < k){
            p2 = p2.next;
            count++;
        }

        while(p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.id;
    }

}
