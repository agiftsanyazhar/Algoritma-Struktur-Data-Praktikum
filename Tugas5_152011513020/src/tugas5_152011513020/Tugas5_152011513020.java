package tugas5_152011513020;

public class Tugas5_152011513020 {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 5 - Node");
        System.out.println("-------------------------------------------------");
        
        Node x = new Node(5);
        Node y = new Node(10);
        Node z = new Node(15);
        
        x.print();
        y.print();
        z.print();

        x.setNext(y);
        y.setNext(z);

        System.out.println(x.getInfo());
        System.out.println(x.getNext().getInfo());
        System.out.println(x.getNext().getNext().getInfo());
        
        System.out.print("\n\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 5 - List");
        System.out.println("-------------------------------------------------");
        
        List a;

        a = new List();

        a.addFront(5);
        a.addFront(10);
        a.addFront(15);
        a.addFront(20);
        
        a.addRear(25);
        a.addRear(30);
        a.addRear(35);
        a.addRear(40);

        a.print();

        a.delFront();
        a.print();
        
        a.delFront();
        a.print();

        a.delRear();
        a.print();
        
        a.delRear();
        a.print();

        System.out.print("\n");
        System.out.println("Found       = " + a.found(5));
        System.out.println("Found       = " + a.found(10));
        System.out.println("Found       = " + a.found(15));
        
        System.out.print("\n");
        System.out.println("Position    = " + a.getPosition(10).getInfo());
        
        a.delete(5);
        a.print();
    }
}