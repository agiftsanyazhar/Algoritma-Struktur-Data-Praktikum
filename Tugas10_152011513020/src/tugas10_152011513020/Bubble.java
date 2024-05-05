package tugas10_152011513020;

import java.util.Random;

public class Bubble {
    private int max;
    private int size;
    private int []data;
    
    public Bubble(int maxSize){
        this.data   = new int [maxSize];
        this.max    = maxSize;
        this.size   = 0;
    }
    
    public void random(int n){
        Random r    = new Random();
        for(int i=0; i<this.max; i++){
            this.data[i]    = r.nextInt(n);
        }
    }
    
    public void tukar(int i, int j){
        int z   = data[i];
        data[i] = data[j];
        data[j] = z;
        System.out.println("Yang ditukar = " + data[i] + " dan " + data[j]);
    }
    
     public void bubbleSort(){
        int x[]     = this.data;
        int n       = this.max;
        long total  = 0;
        for(int i=1; i<n; i++){  
            for(int j=0; j<(n-i); j++){  
                if(x[j] > x[j+1]){   
                    tukar(j,j+1);
                    total++;
                }                
            }  
        } 
        System.out.println("Total swap  = " + total);
    }
    
    public void print(){
        for (int i=0; i<this.max; i++){
            System.out.print(this.data[i] + " ");
        }
    }
}