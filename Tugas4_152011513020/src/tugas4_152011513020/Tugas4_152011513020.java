package tugas4_152011513020;

public class Tugas4_152011513020 {
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 4 - Queue");
        System.out.println("-------------------------------------------------");
        Queue a;
        
        a = new Queue(5);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Is Empty");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Queue kosong? " + a.isEmpty());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Is Full");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Queue penuh? " + a.isFull());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3&4 - End Q&De Q");
        System.out.println("-------------------------------------------------");
        
        a.endq(92);
        a.endq(23);
        a.endq(46);
        a.endq(51);
        a.endq(64);
//        a.endq(53);

        a.display();
        
        a.deq();
        a.display();
        
        a.deq();
        a.display();
        
        a.deq();
        a.display();
        
        a.deq();
        a.display();
        
        System.out.print("\n\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 4 - Node");
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
    }
}