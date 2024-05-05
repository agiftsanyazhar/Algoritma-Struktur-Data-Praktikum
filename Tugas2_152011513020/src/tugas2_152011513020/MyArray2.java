package tugas2_152011513020;

public class MyArray2 {
    MyArray2 z;
    int[] data;
    int maxSize;
    int size;
    
//    System.out.println("-------------------------------------------------");
//    System.out.println("Praktikum 1");
//    System.out.println("-------------------------------------------------");
    //Nomor 1
    MyArray2 () {
        this.data       = new int[5];
        this.maxSize    = 5;
        this.size       = 0;
        
        for (int i=0; i<5; i++){
            this.data[i]    = 0;
        }
    }
    
    //Nomor 2
    MyArray2 (int a) {
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
            this.data[i] = (int)(Math.random()*(n+5));
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
    
//    System.out.println("-------------------------------------------------");
//    System.out.println("Praktikum 2");
//    System.out.println("-------------------------------------------------");
    //Nomor 1
    public void shiftRight(){
        int temp = this.data[this.maxSize-1];
        
        for (int i=this.maxSize-1; i>0; i--){
            this.data[i] = this.data[i-1];
        }
        
        this.data[0] = temp;
    }
    
    //Nomor 2
    public void shiftLeft(){
        int temp = this.data[0];
        
        for (int i=0; i<this.maxSize-1; i++){
            this.data[i] = this.data[i+1];
        }
        
        this.data[this.maxSize-1] = temp;
    }
    
    //Nomor 3
    public void reverse(){
        for (int i=0; i<(int)(this.maxSize/2); i++){
            int temp                    = this.data[i];
            this.data[i]                = this.data[this.size-1-i];
            this.data[this.size-1-i]  = temp;
        }
    }
    
    //Nomor 4
    public void shuffle(){
        for (int i=0; i<this.maxSize; i++){
            int random          = (int)(Math.random()*(5));
            int temp            = this.data[i];
            this.data[i]        = this.data[random];
            this.data[random]   = temp;
        }
    }
    
    //Nomor 5
    public int maximum(){
        int max = this.data[0];
        
        for (int i=0; i<this.maxSize; i++){
            if (this.data[i]>max){
                max = this.data[i];
            }   
        }
        System.out.println("Maximum = " + max);
        
        return max;
    }
    
    //Nomor 6
    public int minimum(){
        int min = this.data[0];
        
        for (int i=0; i<this.maxSize; i++){
            if (this.data[i]<min){
                min = this.data[i];
            }
        }
        System.out.println("Minimum = " + min);
        
        return min;
    }
    
    //Nomor 7
    public int sum(){
        int sum = 0;
        
        for (int i=0; i<this.maxSize; i++){
            sum = sum+this.data[i];
        }
        System.out.println("Jumlah = " + sum);
        
        return sum;
    }
    
    //Nomor 8
    public double mean(){
        int sum = 0;
        
        for (int i=0; i<this.maxSize; i++){
            sum = sum+this.data[i];
        }
        double mean = sum/(double)this.maxSize;
        
        System.out.println("Mean = " + mean);
        
        return mean;
    }
    
    //Nomor 9
    public int maxPosition(){
        int maxPosition = 0;
        
        for (int i=0; i<this.maxSize; i++){
            if (this.data[i]==this.maximum()){
                maxPosition = i;
            }
        }
        System.out.println("Nilai terbesar berada di posisi = " + maxPosition);
        
        return maxPosition;
    }
    
    //Nomor 9
    public int minPosition(){
        int minPosition = 0;
        
        for (int i=0; i<this.maxSize; i++){
            if (this.data[i]==this.minimum()){
                minPosition = i;
            }
        }
        System.out.println("Nilai terkecil berada di posisi = " + minPosition);
        
        return minPosition;
    }
}