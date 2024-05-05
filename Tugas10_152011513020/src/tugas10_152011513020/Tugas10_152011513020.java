package tugas10_152011513020;

import java.util.Random;

public class Tugas10_152011513020 {
    
//    public static long bubbleSort(int size){
//        long swap;
//        int[] x     = new int[size];
//        Random rand = new Random();
//
//        //Memasukan Angka Random 
//        for (int i=0; i<size; i++){
//            x[i]    = rand.nextInt(10000000);
//        }
//
//        //Sorting
//        swap = 0;
//        for (int i=2; i<size; i++){
//            for (int j=0; j<size-i; j++){
//                if(x[j] > x[j+1]){
//                    int temp    = x[j+1];
//                    x[j+1]      = x[j];
//                    x[j]        = temp;
//
//                    swap++;
//                }
//            }
//        }
//        return swap;
//    }

    public static void main(String[] args) {
//        Tugas10_152011513020 a;
//        
//        a   = new Tugas10_152011513020();
//        
//        a.bubbleSort(1000);
//        
//        System.out.println(a.bubbleSort(1000));
        
        //Class
        Bubble arr;

        arr = new Bubble(10);
        
        arr.random(20);
        arr.bubbleSort();
        arr.print();
    }   
}