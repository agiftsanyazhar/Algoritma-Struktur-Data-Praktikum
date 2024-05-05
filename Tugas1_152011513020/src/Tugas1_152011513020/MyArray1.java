package Tugas1_152011513020;

public class MyArray1 {
    MyArray1 z;
    int[] data;
    int maxSize;
    int size;
    
    //Nomor 1
    MyArray1 () {
        this.data       = new int[5];
        this.maxSize    = 5;
        this.size       = 0;
        
        for (int i=0; i<5; i++){
            this.data[i]    = 0;
        }
    }
    
    //Nomor 2
    MyArray1 (int a) {
        this.data       = new int[a];
        this.maxSize    = a;
        this.size       = 0;
        
        for (int i=0; i<this.maxSize; i++) {
            this.data[i]    = 0;
        }
    }
    
    //Nomor 3
    public void random (int n) {
        for (int i=0; i<this.maxSize; i++) {
            this.data[i] = (int)(Math.random()*(6));
            this.size++;
        }
    }
    
    //Nomor 4
    public void display () {
        for (int i=0; i<maxSize; i++) {
            System.out.print(" " + data[i] + " ");
        }
        System.out.print("\n\n");
    }
    
    //Nomor 5
    int getSize(){
        return size;
    }
    
    //Nomor 6
    public void insert (int x) {
         for (int i=(this.maxSize-1); i>0; i--){
             this.data[i] = this.data[i-1];
         }
         
         this.data[0] = x;
         if (this.size<this.maxSize){
             this.maxSize++;
         }
    }
    
    //Nomor 7
    public void setElement (int position, int element) {
        this.data[position] = element;
    }

    //Nomor 8
    int getElement (int position) {
        return this.data[position];
    }

    //Nomor 9
    MyArray1 copy (MyArray1 x) {
        return x;
    }
    
//    MyArray1 copy () {
//        z = new MyArray1(this.maxSize);
//        
//        for (int i=(this.maxSize-1); i>0; i--){
//            z.insert(data[i]);
//        }
//        
//        z.insert(data[0]);
//        
//        return z;
//    }
}