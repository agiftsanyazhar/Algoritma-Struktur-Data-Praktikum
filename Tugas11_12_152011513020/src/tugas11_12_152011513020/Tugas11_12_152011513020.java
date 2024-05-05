package tugas11_12_152011513020;

public class Tugas11_12_152011513020 {

    public static void main(String[] args) {
        Array s = new Array(1000000);
        s.random(10000000);
        s.print();
        s.selection();
        s.print();
        
        Array b = new Array(1000000);
        b.random(10000000);
        b.print();
        b.bublesort();
        b.print();
        
        Array i = new Array(200000);
        i.random(100000000);
        i.print();
        i.insertion();
        i.print();
    }
}