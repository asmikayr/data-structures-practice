package LRUCacheProblemLeetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    //Doubly Linked List class
    public class DNode{
        int key;
        int value;
        DNode next;
        DNode prev;

        public DNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public DNode() {
        }
    }
    //things I need for LRU Cache
    int size;
    int capacity;
    DNode head;
    DNode tail;
    HashMap<Integer, DNode> cacheMap = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head=new DNode();
        this.tail=new DNode();
        this.head.next=tail;
        this.tail.prev=head;

    }

    //methods for Doubly linked list
    public void addNode(DNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    public void removeNode(DNode node){
        DNode prev = node.prev;
        DNode next = node.next;
        prev.next=next;
        next.prev=prev;
    }

    public void moveToHead(DNode node){
        removeNode(node);
        addNode(node);
    }

    public DNode popTail(){
        DNode popped=tail.prev;
        removeNode(popped);
        return popped;
    }


    public int get(int key){
        DNode node=cacheMap.get(key);
        if(node==null) return -1;
        else{
            moveToHead(node);
            return node.value;
        }

    }

    public void put(int key, int value){
        //go to cacheMap and check if key is there
        DNode node=cacheMap.get(key);
        if(node==null){
            //add this new pair
            DNode newNode = new DNode(key, value);
            cacheMap.put(key, newNode);
            addNode(newNode);
            size++;
            if(size>capacity){
                DNode last=popTail();//element removed from Doubly Linked list
                cacheMap.remove(last.key);
                size--;
            }
        }else{//update existing Node value
            node.value = value;
            moveToHead(node);

        }

    }

    // Printing for testing
//    void printLRUCache(){
//        for(Map.Entry<Integer, DNode> entry: cacheMap.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue().value);
//        };
//    }

}
