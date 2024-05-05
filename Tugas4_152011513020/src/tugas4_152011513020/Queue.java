package tugas4_152011513020;

public class Queue {
    int[] data;     // array yang menampung data dalam queue
    int maxSize;    // ukuran array data
    int front;      // pointer menandai posisi terdepan
    int rear;       // pointer menandai posisi terakhir
    
    public Queue(int max){
        this.maxSize    = max;
        this.data       = new int[this.maxSize];
        this.front      = 0;
        this.rear       = 0;
    }
    
    // Nomor 1
    public boolean isEmpty(){
        if (this.rear == this.front){
            return true;
        }
        else return false;
    }
    
    // Nomor 2
    public boolean isFull(){
        if(this.rear == maxSize){
            return true;
        }
        else return false;
    }
    
    // Nomor 3
    public void endq(int element){
        if (isFull() == false){
            this.data[this.rear]    = element;
            
            this.rear++;
        }
    }
    
    // Nomor 4
    public int deq(){
        if(isEmpty() == false){
            this.front++;
            
            return this.data[this.front];
        }
        else return 0;
    }
    
    public void display(){
        for (int i=front; i<this.maxSize; i++) {
            System.out.print(this.data[i] + "   ");
        }
        System.out.print("\n");
    }
}