package tugas3_152011513020;

import java.util.Scanner;

public class Tugas3_152011513020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 3");
        System.out.println("-------------------------------------------------");
        Stack a;
        
        a = new Stack (5);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Is Empty");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Stack kosong? " + a.isEmpty());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Is Full");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Stack penuh? " + a.isFull());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Push");
        System.out.println("-------------------------------------------------");
        
        // Static
//        a.push(92);
//        a.push(23);
//        a.push(46);
//        a.push(51);
//        a.push(64);
////        a.push(53);
//        
//        a.printStack();
        

        // Dinamis
        System.out.print("Masukan max   = ");
        int n = input.nextInt();
        a = new Stack (n);
        
        for (int i=0; i<n; i++){
            System.out.print("Input Stack [" + i + "] = ");
            int x = input.nextInt();
            a.push(x);
        }
        
        a.display();
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 4 Pop");
        System.out.println("-------------------------------------------------");
        System.out.println("Data temp = " + a.pop());
        
        Stack s;

int x;

s = new Stack(5);

for(int i=0;i<5;i++)

      s.push(2*i+1);

x = s.pop();

System.out.println(x);
    }
}