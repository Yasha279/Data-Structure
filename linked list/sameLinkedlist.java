import java.util.*;
public class sameLinkedlist {
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info=data;
            this.link=null;
        }
        public Node first;
        public boolean compareLinkedlist(sameLinkedlist listb){
            Node a=this.first,b=listb.first;
            while(a!=null && b!=null){
                if(a.info!=b.info){
                    return false;
                }
                a=a.link;
                b=b.link;
            }
            return (a==null && b==null);
        }
        public void insert(int info){
            Node newNode=new Node(info);
            if(first==null){
                first=newNode;
                return;
            }
            newNode.link=first;
            first=newNode;
        }
        public void display(){
            Node newNode1=first;
            while(newNode1!=null){
                System.out.println(newNode1.info + " ");
                newNode1=newNode1.link;
            }
        }
    }
    public static void main(String[] args){
        sameLinkedlist list1=new sameLinkedlist();
        sameLinkedlist list2=new sameLinkedlist();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.display();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.display();
        if(list1.compareLinkedlist(list2)==true){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
