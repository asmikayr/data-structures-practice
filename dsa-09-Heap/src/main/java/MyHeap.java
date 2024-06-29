public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity){
        this.items = new int[capacity];
        this.size = 0;
    }

    public int leftChildIndex(int index){return index*2+1;}
    public int rightChildIndex(int index){return index*2+2;}
    public int parentChildIndex(int index){return (index-1)/2;}





}
