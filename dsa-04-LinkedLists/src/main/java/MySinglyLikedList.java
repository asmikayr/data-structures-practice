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

    void addFirst(int data){
        //create a new node object from data
        Node node =  new Node(data);
        if(isEmpty()){
            head=tail=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }


    int indexOf(int id){
        if(isEmpty()) return -1;
        int pos=0;
        //iterate through the list
        Node current=head;//set my current with the starting element;
        while(current!= null){
            if(current.id==id) return pos;
            pos++;
            current=current.next;

        }
        return -1;
    }

    void deleteById(int id){
        //check if empty
        if(isEmpty()) System.out.println("List is empty!");
        //assign prev and current with the head
        Node prev=head;
        Node current=head;

        while (current != null) {
            if(current.id==id){//there is a match
                //case1: head
                if(current==head){
                    head=current.next;
                    current.next=null;

              //case2: tail
                }else if(current==tail){

                    tail=prev;
                    prev.next=null;
                //case3: middle
                }else{
                    prev.next=current.next;
                    current.next=null;
                }


                //after deletion

                size--;
            }
            //move forward on the elements of the list
            prev = current;
            current = current.next;
        }
    }

    void printNodes(){
        Node current=head;
        while(current!=null){
            if(current.next== null) System.out.println(current.id+"=>null");
            else{
                System.out.print(current.id+"=>");
            }
            current=current.next;

        }
    }

    public int getKthFromLast(int k){
        // write your code here

        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k-1; i++) {
            p2 = p2.next;

        }

        while(p2.next != null){
            p1=p1.next;
            p2=p2.next;
        }

        return p1.id;
    }

    public void removeKthFromLast(int k) {
// write your code here…

        //create three pointers
        Node p1 = head;
        Node p2 = head;
        Node prev = null;
        //move p2 k-1 times

        for (int i = 0; i < k-1; i++) {
            p2 = p2.next;

        }

        // move both pointers until p2 hits the last element
        while(p2.next != null){
            prev=p1;
            p1=p1.next;
            p2=p2.next;
        }

        //p1 is on the kth element from the last
        //do delete operation
        if(p1==head){
            head = p1.next;
            p1.next = null;
            size--;
        }else if(p1==tail){
            tail = prev;
            prev.next=null;
            size--;
        }else{
            prev.next = p1.next;
            p1.next = null;
            size--;

        }





    }


}
