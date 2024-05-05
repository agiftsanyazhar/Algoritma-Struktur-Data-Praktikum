package tugas11_12_152011513020;

import java.util.Random;

public class Array{
    private int size;
    private int [] data;
    Random randomNumbers = new Random();
    private long count;
    
    public Array(int size){
        this.size = size;
        data = new int [size];
        count = 0;
    }    
    
    public void random(int n){   
        for (int i=0; i<size; i++){
            data[i] = randomNumbers.nextInt(n)+1;
        }
    }    
    
    public void bublesort(){
        for (int k=2; k<=size; k++){
            for(int i=0; i<=size-k; i++){
                if (data[i]>data[i+1]){
                    swap(i,i+1);
                    count++;
                }
            }
        }
    }
    
    public void selection(){
        for (int i=0; i<this.size-1; i++){
            int min_id = i;
            for (int j=i+1; j<this.size; j++){
                if (data[j] < data[min_id]){
                min_id = j;}
            }
            swap(i, min_id);  
            count++;
        }
    }

    public void insertion(){
        for(int i=1; i<this.size; i++){
            int temp = data[i];
            int j = i-1;

            while (j >= 0 && data[j]>temp) {
              data[j+1] = data[j];
              j--;
              count++;
            }
            data[j+1] = temp;
        }
    }
        
    public void swap(int i, int j){
        int a = data[i];
        data[i] = data[j];
        data[j] = a;
    }
    
    public void print(){
       for (int j=0; j<this.size; j++){
           System.out.print(data[j]+"  ");
       }
       System.out.println("");
       System.out.println("Jumlah swap = "+count);
    }
}