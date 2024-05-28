import java.util.NoSuchElementException;

public class MyQueue <T>{
    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue(){

    }
    boolean isEmpty(){return front==null;}

    void enqueue(T item){
        QNode<T> node=new QNode<>(item);
        if (isEmpty()) front=back=node;
        else{
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue(){
        QNode<T> frontNode;
        if(isEmpty()) throw new NoSuchElementException();
        if (front==back){
            frontNode=front;
            front=back=null;
        }else{
            frontNode=front;
            front=frontNode.next;
        }
        size--;
        return frontNode.value;
    }

    T peek(){ return front.value;}
    int size(){ return size;}


}
