class BSToperation {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    Node root;
    BSToperation(){
        root=null;
    }
    void insert(int data){
        root=insertRecord(root,data);
    }
    public Node insertRecord(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insertRecord(root.left,data);
        }
        else if(data>root.data){
            root.right=insertRecord(root.right,data);
        }
        return root;
    }
    public void display()
    {
        inorder(root);
    }
    private void inorder(Node root)
    {
        // System.err.println("hello");
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
}
public class BSTInsert
{
    public static void main(String[] args){
        BSToperation BO=new BSToperation();
        BO.insert(10);
        BO.insert(5);
        BO.insert(14);
        BO.insert(4);
        BO.insert(7);
        BO.insert(8);
        BO.display();
    }
}
