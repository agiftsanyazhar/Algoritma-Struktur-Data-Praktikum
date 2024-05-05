package Tugas1_152011513020;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 1");
        System.out.println("-------------------------------------------------");
        
        MyArray1 a;
        MyArray1 b;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 My Array");
        System.out.println("-------------------------------------------------");
        a = new MyArray1();

        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 My Array");
        System.out.println("-------------------------------------------------");
        a = new MyArray1(3);
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Random");
        System.out.println("-------------------------------------------------");
        a.random(10);
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Display");
        System.out.println("-------------------------------------------------");
        a.display();

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Get Size");
        System.out.println("-------------------------------------------------");
        System.out.println("Size = " + a.getSize());
        System.out.print("\n");

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 6 Insert");
        System.out.println("-------------------------------------------------");
        a.insert(17);
        a.display();

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 7 Set Element");
        System.out.println("-------------------------------------------------");
        a.setElement(2, 10);
        a.display();

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 8 Get element");
        System.out.println("-------------------------------------------------");
        System.out.println("Get element 3 = " + a.getElement(2));
        System.out.print("\n");

        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 9 Copy");
        System.out.println("-------------------------------------------------");
        b = a.copy(a);
//        b = a.copy();
        b.display();
    }
}