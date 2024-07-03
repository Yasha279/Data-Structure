import java.util.*;

public class linkedList{
    public static void main(String[] args) {
        
    }
}

class Node{
    int data;
    Node link;
    Node first=null;
    int temp;
    public Node(int data){
        this.data=data;
    }
    public void push(){
        if(first==null){
            first=new Node(data);
            first.data=data;
        }
        else{
            temp=new Node();
            temp=first;
        }
    }
}