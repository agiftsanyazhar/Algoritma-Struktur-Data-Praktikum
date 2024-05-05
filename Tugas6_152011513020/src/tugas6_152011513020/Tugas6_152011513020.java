package tugas6_152011513020;

public class Tugas6_152011513020 {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 6");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 - Membuat Method untuk Membalik Node (Single "
                + "Linked List)");
        System.out.println("-------------------------------------------------");
        
        List a;

        a = new List();

        a.addFront(5);
        a.addFront(10);
        a.addFront(15);
        a.addFront(20);
        a.addFront(25);
        a.print();
        
        a.reverse();
        a.print();
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 - Membuat Circular Single Linked List");
        System.out.println("-------------------------------------------------");
        
        Circular b;

        b = new Circular();

        b.addFront(30);
        b.addFront(35);
        b.addFront(40);
        b.addFront(45);
        b.addFront(50);
        b.addRear(55);
        b.addRear(60);
        b.addRear(65);
        b.addRear(70);
        b.addRear(75);
        b.print();
    }
}