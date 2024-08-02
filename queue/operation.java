import java.util.*;
public class operation{
    int r=-1;
    int size;
    int f=-1;
    int q[];
    public operation(int size){
        this.size=size;
        q=new int[size];
    }
    public void enqueue(int data){
        if(r>=(size-1)){
            System.out.println("queue overflow");
            return;
        }
        r++;
        q[r]=data;
        if(f==-1){
            f=0;
            return;
        }
    }
    public int dequeue(){
        if(f==-1){
            System.out.println("queue underflow");
            return 0;
        }
        int y=q[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else{
            f++;
        }
        return y;
    }
    public void display(){
        for(int i=f;i<r;i++){
            System.out.println(q[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        // System.out.println("Enter 1:PUSH, 2:POP, 3:DISPLAY, 4:PEEP, 5:CHANGE");
        // int ch=sc.nextInt();
        operation op=new operation(n);
        
        op.enqueue(5);
        op.enqueue(6);
        op.enqueue(7);
        op.enqueue(8);
        op.enqueue(9);
        System.out.println("enqueue:");
        op.display();
        op.dequeue();
        System.out.println("dequeue:");
        op.display();
    }
}