package tugas13_152011513020;

import java.util.Random;

public class Sort {
    public int max;
    public int []data;
    
    public Sort(int size){
        this.max    = size;
        this.data   = new int[size];
    }
    
    public void rand(int n){
        Random r = new Random ();
        for(int i=0;i<this.max;i++){
            this.data[i] = r.nextInt(n);
        }
    }
    
    public void bubblesort (){
        int x[] = this.data;
        int n = this.max;
        long total = 0;
        for(int i=1; i < n; i++){  
            for(int j=0; j < (n-i); j++){  
                if(x[j] > x[j+1]){   
                    tukar(j,j+1);
                    total++;
                }                
            }  
        } 
        System.out.println("total swap = "+total);
    }
    
    
    public void selectionSort(){  
        int x[] = this.data;
        int n = this.max;
        long total = 0;
        long start = System.currentTimeMillis();
        
        for (int i=0; i<(n-1); i++){  
            int index = i;  
            for (int j=(i+1); j<n; j++){  
                if (x[j] < x[index]){  
                    index = j;
                }  
            }  
        int temp = x[index];   
        x[index] = x[i];  
        x[i] = temp;
        total++;    
        }
        
        long end = System.currentTimeMillis()-start;
        
        System.out.println("Waktu = "+end+" ms");
        System.out.println("total swap = "+total);
    }
    
    public void insertionSort(){
        long swap=0;
        long start = System.currentTimeMillis();
        
        for (int i=0; i<this.max; i++){
            int j=i-1;
            int tmp = this.data[i];
            while(j>=0 && this.data[j]>tmp){
                tukar(j,j+1);
                swap++;
                j--;
            }
            this.data[j+1]=tmp;
        }
        
        long end = System.currentTimeMillis()-start;
        System.out.println("Waktu = "+end+" ms");
        System.out.println("total swap = "+swap);
    }
    
     public void merge(int[] x, int[] l, int[] r) {
        int nL = l.length;
        int nR = r.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nL && j < nR) {
            if ( l[i] < r[j] ) {
                x[k] = l[i];
                i++;
            } else {
                x[k] = r[j];
                j++;
            }
            k++;
        }
        while ( i < nL ) {
            x[k] = l[i];
            i++;
            k++;
        }
        
        while ( j < nR ) {
            x[k] = r[j];
            j++;
            k++;
        }
    }
    
    public void mergeSort (int[] x) {
        int n = x.length;
        if (n < 2)
            return;
        int mid = n/2;
        int[] l = new int [mid];
        int[] r = new int [n-mid];
        for (int i = 0; i < mid; i++) {
            l[i] = x[i];
        }
        for (int j = mid; j < n; j++) {
            r[j-mid] = x[j];
        }
        mergeSort(l);
        mergeSort(r);
        merge(x, l, r);
    }
    
    int[] data(){
        return this.data;
    }
    
//    public void merge(int x[], int l, int m, int r){
//        int n1 = m - l + 1;
//        int n2 = r - m;
//        
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//        
//        for (int i = 0; i < n1; ++i){
//            L[i] = this.data[l + i];
//        }
//        for (int j = 0; j < n2; ++j){
//            R[j] = this.data[m + 1 + j];
//        }
//        
//        int i = 0, j = 0;
//        
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                this.data[k] = L[i];
//                i++;
//            }
//            else {
//                this.data[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//        
//        while (i < n1) {
//            this.data[k] = L[i];
//            i++;
//            k++;
//        }
//        
//        while (j < n2) {
//            this.data[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//    
//    void mergesort(int arr[], int l, int r){
//        if (l < r) {
//            // Find the middle point
//            int m =l+ (r-l)/2;
//  
//            // Sort first and second halves
//            mergesort(arr, l, m);
//            mergesort(arr, m + 1, r);
//  
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
    
    
//    public void mergeRekursif(int l, int r){
//        if (l<r){
//            int med = (l+r)/2;
//            mergeRekursif(l,med);
//            mergeRekursif(med+1,r);
//            merge(l,med,r);
//        }
//    }
    
//    public void merge(int l, int med, int r){
//        int kiri1 = l;
//        int kanan1 = med;   
//        int kiri2 = med+1;
//        int kanan2 = r; 
//        int i = l;
//        
//        while (kiri1<=kanan1 && kiri2<=kanan2){
//            if (this.data[kiri1] <= this.data[kiri2]){
//                int hasil[i] = this.data[kiri1];
//                kiri1++;
//            }
//        }
//    }
    
    public void print(){
        for (int i =0; i<this.max; i++){
            System.out.print(this.data[i]+" ");
        }
    }
    
    public void tukar(int i, int j){
        int z = data[i];
        data[i] = data[j];
        data[j] = z;
    }
}
