

public class count {
    class Node{
        int info;
        Node link;
    public Node(int info){
        this.info=info;
        this.link=null;
    }
    }
    public Node first=null;
    public void push(int data){
        Node newNode=new Node(data);
        if(first==null){
            first=newNode;
            return;
        }
        Node save=first;
        while(save.link!=null){
            save=save.link;
        }
        save.link=newNode;
    }
    
    public int countNodes(){
        int coun_t=1;
        if(first==null){
            coun_t=1;
            
        }
        else{
        Node save=first;
        while(save.link!=null){
            
            coun_t++;
            save=save.link;
        }
    }
    System.out.println(coun_t);
    return coun_t; 
    }

    public void display(){
        Node newNode1=first;
        while (newNode1 != null) {
            System.out.print(newNode1.info + " ");
            newNode1=newNode1.link;
        }
    }
    public static void main(String[] args) {
        
        count c=new count();
        
        c.push(3);
        c.push(4);
        c.push(5);
        c.display();
        System.out.println("");
        c.countNodes();
    }
}
