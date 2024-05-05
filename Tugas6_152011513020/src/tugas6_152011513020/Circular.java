package tugas6_152011513020;

public class Circular {
    Node head; // pointer menunjuk node terdepan 
    Node tail; // pointer menunjuk node terakhir 
    int size;  // jumlah node yang terdapat dalam list
    
    public Circular(){
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
            this.head.setNext(this.head);
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            t.setNext(this.head);
            this.head=t;
            this.tail.setNext(this.head);
            this.size++;
        }
    }
    
    public void addRear(int info){
        if (isEmpty()==true){
            this.head=new Node(info);
            this.tail=this.head;
            this.head.setNext(this.head);
            this.size++;
        }
        
        else{
            Node t=new Node(info);
            this.tail.setNext(t);
            this.tail=t;
            this.tail.setNext(this.head);
            this.size++;
        }
    }
    
    public void delFront(){
        if (isEmpty()==true){  
        }
        else{
            this.head=this.head.getNext();
            this.tail.setNext(this.head);
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
            this.tail.setNext(this.head);
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
        if (isEmpty()==false){
            Node t=this.head;
            int pos=1;
            while (t.info!=info&&pos<this.size){
                t=t.getNext();
                pos++;
            }
            if (t.getInfo()==info){
                if(t==this.head){
                    delFront();
                }
                else if (t==this.tail){
                    delRear();
                }
                else{
                    t=t.getNext();
                    Node a=this.head;
                    for(int i=1;i<(pos-1);i++){
                        a=a.getNext();
                    }
                    a.setNext(t);
                    this.size--;
                }
            }
        }
    }
    
    public void print(){
        Node t=this.head;
        for(int i=1;i<=this.size+1;i++){
            System.out.print(t.getInfo()+" ");
            t=t.getNext();
        }
        System.out.println("");
    }
}