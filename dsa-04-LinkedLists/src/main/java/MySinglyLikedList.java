public class MySinglyLikedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        //create a new node object from data
        Node node =  new Node(data);
        if(isEmpty()){
            head=tail=node;
            size++;
        }else{
            tail.next=node;
            tail=node;
            size++;
        }
    }

    void printNodes(){
        Node current=head;
        while(current!=null){
            if(current.next== null) System.out.println(current.id+"=>null");
            System.out.println(current.id+"=>");
            current=current.next;
        }
    }

}
