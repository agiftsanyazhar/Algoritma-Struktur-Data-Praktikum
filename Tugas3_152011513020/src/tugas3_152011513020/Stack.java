package tugas3_152011513020;

public class Stack {
    int[] data;
    int top;
    int maxSize;
    
    Stack(int max){
        this.maxSize    = max;
        this.data       = new int[maxSize];
        this.top        = -1;
    }
    
    // Nomor 1
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else return false;
    }
    
    // Nomor 2
    public boolean isFull(){
        if (top == maxSize-1){
            return true;
        }
        else return false;
    }
    
    // Nomor 3
    public void push(int element){
        if (isFull() == false){
            top ++;
            data[top] = element;
        }
    }
    
    // Nomor 4
    public int pop(){
        if (isEmpty() == false){
            int temp = data[top];
            top --;
            return temp;
        }
        else return 0;
    }
    
    public void display(){
        for (int i=0; i<maxSize; i++) {
            System.out.print(" " + data[i] + " ");
        }
        System.out.print("\n\n");
    }
}