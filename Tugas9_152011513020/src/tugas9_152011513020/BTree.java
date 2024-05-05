package tugas9_152011513020;

public class BTree {
    TNode root;
    int size;
    
    public BTree(){
        this.root   = null;
        this.size   = 0;
    }
    
    public void insert(int info){
        this.root   = insert(this.root,info);
    }
    
    public TNode insert(TNode tnode, int info){
        if (tnode == null){
            tnode   = new TNode(info);
            return tnode;
        }
        if (tnode.getInfo()>info){
            tnode.setLeft(insert(tnode.getLeft(),info));
        }
        else if (tnode.getInfo()<info){
            tnode.setRight(insert(tnode.getRight(), info));
        }
        return tnode;
    }
    
    public void printPostorder(TNode tnode)
    {
        if (tnode == null){
            return;
        }
            
        printPostorder(tnode.left);

        printPostorder(tnode.right);

        System.out.print(tnode.getInfo() + " ");
    }
    
    public void printPostorder() { 
        printPostorder(root); 
        System.out.println("");
    }
    
    public void printInorder(TNode tnode)
    {
        if (tnode == null){
            return;
        }
        
        printInorder(tnode.left);

        System.out.print(tnode.getInfo() + " ");
        
        printInorder(tnode.right);

    }
    
    public void printInorder() { 
        printInorder(root); 
        System.out.println("");
    }
    
    public void printPreorder(TNode tnode)
    {
        if (tnode == null){
            return;
        }
        
        System.out.print(tnode.getInfo() + " ");

        printPreorder(tnode.left);
        
        printPreorder(tnode.right);

    }
    
    public void printPreorder() { 
        printPreorder(root); 
        System.out.println("");
    }
}