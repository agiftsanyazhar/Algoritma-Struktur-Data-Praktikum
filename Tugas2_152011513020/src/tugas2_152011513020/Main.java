package tugas2_152011513020;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 1");
        System.out.println("-------------------------------------------------");
        
        MyArray2 a;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 My Array");
        System.out.println("-------------------------------------------------");
        a = new MyArray2();

        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 My Array");
        System.out.println("-------------------------------------------------");
        a = new MyArray2(5);
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Random");
        System.out.println("-------------------------------------------------");
        a.random(100);
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
        System.out.print("\n\n\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 2");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Shift Right");
        System.out.println("-------------------------------------------------");
        a.shiftRight();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Shift Left");
        System.out.println("-------------------------------------------------");
        a.shiftLeft();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Reverse");
        System.out.println("-------------------------------------------------");
        a.reverse();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Shuffle");
        System.out.println("-------------------------------------------------");
        a.random(100);
        a.display();
        a.shuffle();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 5 Maximum");
        System.out.println("-------------------------------------------------");
        a.maximum();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 6 Minimum");
        System.out.println("-------------------------------------------------");
        a.minimum();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 7 Sum");
        System.out.println("-------------------------------------------------");
        a.sum();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 8 Mean");
        System.out.println("-------------------------------------------------");
        a.mean();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 9 Max Position");
        System.out.println("-------------------------------------------------");
        a.maxPosition();
        a.display();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 10 Min Position");
        System.out.println("-------------------------------------------------");
        a.minPosition();
        a.display();
    }
    
}