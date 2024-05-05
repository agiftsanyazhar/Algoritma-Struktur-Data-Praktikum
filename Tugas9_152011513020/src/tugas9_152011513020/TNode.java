package tugas9_152011513020;

public class TNode {
    int info;
    TNode left;
    TNode right;
    
    public TNode(int info){
        this.info = info;
    }
    
    public void setInfo(int info){
        this.info = info;
    }
    
    public int getInfo(){
        return info;
    }
    
    public void setLeft(TNode node){
        left = node;
    }
    
    public TNode getLeft(){
        return left;
    }
    
    public void setRight(TNode node){
        right = node;
    }
    
    public TNode getRight(){
        return right;
    }
}
