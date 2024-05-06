package StackReview;

public class MySinglyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    T removeFirst(){
        if(isEmpty()) return null;
        T result = null;
        if(head==tail){
            result= head.value;
        }
        return result;
    }
    // removeFirst()
    void addFirst(int data){
        // create a new node object from data
        Node node=new Node(data);
        // case 1: list empty
        if(isEmpty()){
            head=tail=node;
        } else{// case 2 : list is not empty
            node.next=head;
            head=node;
        }
        //increase size
        size++;
    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes(){
        Node current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.value+"=> null");
            else {
                System.out.print(current.value+"=> ");
            }
            current=current.next;
        }
    }
}
