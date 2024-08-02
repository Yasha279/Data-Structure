import java.util.*;
public class circularQueue {
    int r=-1;
    int size;
    int f=-1;
    int q[];
    public circularQueue(int size){
        this.size=size;
        q=new int[size];
    }
    public void cqinsert(int data){
        if(r==size){
            r=0;
        }
        else{
            r++;
        }
        if(f==r){
            System.out.println("queue overflow");
            return;
        }
        q[r]=data;
        if(f==-1){
            f=0;
            return;
        }
    }    
    public void display(){
        for(int i=f;i!=r;i=(i+1)%size){
            System.out.println(q[i]);
        }
        System.out.println(q[r]);
    }
    public int cqdelete(){
        if(f==-1){
            System.out.println("queue underflow");
            return 0;
        }
        int y=q[f];
        if(f==r){
            f=-1;
            r=-1;
            return y;
        }
        if(f==size){
            f=0;
            return y;
        }
        else{
            f++;
            return y;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        circularQueue cq=new circularQueue(n);
        cq.cqinsert(5);
        cq.cqinsert(6);
        cq.cqinsert(7);
        cq.cqinsert(8);
        cq.cqinsert(9);
        System.out.println("insert:");
        cq.display();
        cq.cqdelete();
        System.out.println("delete:");
        cq.display();
        cq.cqinsert(5);
        cq.display();
    }
}
