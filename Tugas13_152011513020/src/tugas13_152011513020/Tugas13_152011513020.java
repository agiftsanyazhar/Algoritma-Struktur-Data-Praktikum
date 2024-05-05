package tugas13_152011513020;

public class Tugas13_152011513020 {

    public static void main(String[] args) {
        
//        BubbleSort(5,10);
//        SelectionSort(5,10);
//        InsertionSort(5,10);
        MergeSort(200000,1000000);
    }
    
    public static void BubbleSort(int data, int nilai){
        //bubelsrot
        Array bS;
        
        bS=new Array(data); //banyak data
        
        bS.input(nilai); //batas nilai data
        
        bS.bubbleSort();
        
//        bS.print();
    }
    
    public static void SelectionSort(int data, int nilai){
        //seleksensrot
        Array sS;
        
        sS=new Array(data); //banyak data
        
        sS.input(nilai); //batas nilai data
        
        sS.selectionSort();
       
//        sS.print();
    }
    
    public static void InsertionSort(int data, int nilai){
        //insertsrot
        Array iS;
        
        iS=new Array(data); //banyak data
        
        iS.input(nilai); //batas nilai data
        
        iS.insertionSort();
        
//        iS.print();
    }
    
    public static void MergeSort(int data, int nilai){
        //insertsrot
        Array mS;

        mS=new Array(data); //banyak data

        mS.input(nilai); //batas nilai data

        System.out.println("===== MERGERSORT =====");

        long mulai = System.currentTimeMillis();

        mS.mergerSort(mS.getArray(),1,mS.getArray().length);

        long kelar = System.currentTimeMillis()-mulai;

        System.out.println("Waktu :"+kelar+" ms");
    }
}