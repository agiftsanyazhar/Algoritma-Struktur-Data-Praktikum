package tugas13_152011513020;

import java.util.Random;

public class Array {
    int[] a;
    int maxsize;
    Random rand = new Random();
    
    Array(int size){
        this.a = new int[size];
        this.maxsize = size;
    }
    
    int[] getArray(){
        return this.a;
    }
    
    void print(){
        for(int i=0; i<this.maxsize; i++){
            System.out.print(this.a[i]+" ");
        }
        System.out.println("");
    }
    
    void swap(int i, int j){
        int z = this.a[i];
	this.a[i] = this.a[j];
        this.a[j] = z;
    }
    
    void input(int n){
        for (int i=0;i<this.maxsize;i++){
            this.a[i]=rand.nextInt(n)+1;
        }
    }
    
    void bubbleSort(){
        long swap = 0;
        for (int i=2;i<this.maxsize;i++){
            for (int j=0;j<=this.maxsize-i;j++){
                if(this.a[j]>this.a[j+1]){
                    swap(j+1,j);
                    swap++;
                }
            }
        }
        
        System.out.println(swap);
    }
    
    void selectionSort(){
        long swap = 0;
        for(int i=this.maxsize-1; i>=1; i--){
            int max=i;
            for(int j=i-1; j>=0;j--){
                if(this.a[j]>this.a[max]){
                    max=j;
                }
            }
            swap(i,max);
            swap++;
        }
        System.out.println(swap);
    }
    
    void insertionSort(){
        long swap=0;
        for (int i=0; i<this.maxsize; i++){
            int j=i-1;
            int tmp = this.a[i];
            while(j>=0 && this.a[j]>tmp){
                swap(j,j+1);
                swap++;
                j--;
            }
            this.a[j+1]=tmp;
        }
        System.out.println(swap);
    }
    
    void mergerSort(int[] a, int start, int end) {
        int n = end - start + 1;
        if (n <= 1)
                return;

        int middle = start + (n / 2) - 1;
        mergerSort(a, start, middle);
        mergerSort(a, middle + 1, end);
        merge(a, start, middle, end);
    }
    
    void merge(int[] a,int start, int middle, int end){
        int[] b = new int[end - start + 1];

        int i = start;
        int j = middle + 1;

        for (int k = 0; k < b.length; k++) { 
            if (j > end) {
                b[k] = a[i - 1];
                i++;
            }
            else if (i > middle) {
                b[k] = a[j - 1];
                j++;
            }
            else if (a[i - 1] < a[j - 1]) {
                b[k] = a[i - 1];
                i++;
            } 
            else {
                b[k] = a[j - 1];
                j++;
            }
        }

        for (int k = 0; k < b.length; k++) {
            a[start - 1 + k] = b[k];
        }
    }
}