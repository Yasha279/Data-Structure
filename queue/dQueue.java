import java.util.*;
public class dQueue {
    int r=-1;
    int size;
    int f=-1;
    int dq[];
    public dQueue(int size){
        this.size=size;
        dq=new int[size];
    }
    public void dQuInsertFront(int data){
        if(f==0){
        System.out.println("overflow");
        return;
        }
        if(f==-1){
            f=0;
            r=0;
        }
        else{
            f--;
        }
        dq[f]=data;
        return;
    }public void dQuInsertEnd(int data){
        if(r>=(size-1)){
            System.out.println("queue overflow");
            return;
        }
        r++;
        dq[r]=data;
        if(f==-1){
            f=0;
            return;
        }
    }
    public int dQuDeleteFront(){
        if(f==-1){
            System.out.println("queue underflow");
            return 0;
        }
        int y=dq[f];
        if(f==r){
            f=-1;
            r=-1;
        }
        else{
            f++;
        }
        return y;
    }
    public int dQuDeleteEnd(){
        if(r==-1){
            System.out.println("underflow");
            return 0;
        }
        int y=dq[r];
        if(r==f){
            r=-1;
            f=-1;
        }
        else{
            r--;
        }
        return y;
    }
    public void display(){
        for(int i=f;i!=r;i=(i+1)%size){
            System.out.println(dq[i]);
        }
        System.out.println(dq[r]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        dQueue dqu=new dQueue(n);
        dqu.dQuInsertEnd(5);
        dqu.display();
    }
}
