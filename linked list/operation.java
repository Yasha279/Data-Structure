public class operation{
    class Node{
        int info;
        Node link;
    public Node(int info){
        this.info=info;
        this.link=null;
    }
    }
    public Node first=null;
    public void insertAtFirst(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            return;
        }

        newNode.link=first;
        first=newNode;
    }

    public void printList() {
        Node newNode1=first;
        while (newNode1 != null) {
            System.out.print(newNode1.info + " ");
            newNode1=newNode1.link;
        }
    } 

    public void insertAtLast(int info){
        Node newNode2=new Node(info);
        if(first==null){
            first=newNode2;
            return;
        }
        Node save=first;
        while(save.link!=null){
            save=save.link;
        }
        save.link=newNode2;
    }

    public void deleteAtFirst(){
        if(first==null){
            System.out.println("underflow");
            return;
        }
        first=first.link;
    }

    public void deleteAtLast(){
        if(first==null){
            System.out.println("umderflow");
            return;
        }
        Node pred=null;
        Node save=first;
        while(save.link!=null){
            pred=save;
            save=save.link;
            
        }
        pred.link=null;
    }

    public void deleteAtSpecified(int info){
        Node newNode3=new Node(info);
        if(first==null){
            System.out.println("underflow");
        }
        Node save=first;
        Node pred=null;
        while(save!=newNode3 && save.link!=null ){
            pred=save;
            save=save.link;
        }
        if(save!=newNode3){
            System.out.println("not found");
        }
        else if(newNode3==first){
            first=first.link;
        }
        else{
            pred.link=newNode3.link;
        }
        pred.link=null;
    }
public static void main(String[] args) {
    operation op=new operation();
    op.insertAtFirst(3);
    op.insertAtFirst(4);
    op.insertAtFirst(5);
    op.printList();
    op.insertAtLast(6);
    op.insertAtLast(7);
    op.insertAtLast(8);
    System.out.println();
    op.printList();
    System.out.println();
    op.deleteAtFirst();   
    op.printList();
    System.out.println();
    op.deleteAtLast();   
    op.printList();
    System.out.println();
    op.deleteAtSpecified(6);   
    op.printList(); 
}
}