/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6_152011513020;

/**
 *
 * @author Agiftsany Azhar
 */
public class List {
    Node head; // pointer menunjuk node terdepan 
    Node tail; // pointer menunjuk node terakhir 
    int size; // jumlah node yang terdapat dalam list
    
    public List(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public boolean isEmpty(){
        return this.size==0;
    }
    
    public void addFront(int info){
        if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=this.head;
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            t.setNext(this.head);
            this.head=t;
            this.size++;
        }
    }
    
    public void addRear(int info){
        if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=new Node(info);
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            this.tail.setNext(t);
            this.tail=t;
            this.size++;
        }
    }
    
    public void delFront(){
        if (isEmpty()==true){  
        }
        else{
            this.head=this.head.getNext();
            this.size--;
        }
    }
    
    public void delRear(){
        if (isEmpty()==true){  
        }
        else{
            Node t=this.head;
            for(int i=1;i<(this.size-1);i++){
                t=t.getNext();
            }
            this.tail=t;
            this.size--;
        }
    }
    
    public boolean found(int info){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            if(t.getInfo()==info){
                return true;
            }
            t=t.getNext();
        }
        return false;
    }
    
    public Node getPosition(int info){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            if(t.getInfo()==info){
                return t;
            }
            t=t.getNext();
        }
        return null;
    }
    
    public void delete(int info){
        Node t=this.head;
        int pos=0;
        boolean parm=false;
        do{
            if (t.getInfo()==info){
                t=t.getNext();
                Node a=this.head;
                for(int i=1;i<(pos-1);i++){
                    a=a.getNext();
                }
                a.setNext(t);
                parm=true;
                this.size--;
            }
            pos++;
            t=t.getNext();
        }while (parm==false || pos==size);
    }
    
    public void reverse(){
        Node a=this.tail;
        Node b=this.head;
        this.head=a;
        int s=this.size;
        while(s!=0){
            Node c=b;
            for (int i=1;i<s-1;i++){
                c=c.getNext();
            }
            a.setNext(c);
            a=a.getNext();
            s--;
        }
        this.tail=b;
    }
    
    public void print(){
        Node t=this.head;
        for(int i=1;i<=this.size;i++){
            System.out.print(t.getInfo()+" ");
            t=t.getNext();
        }
        System.out.println("");
    }
}