import java.util.*;
public class Replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("choose any 2 numbers n1 & n2:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(n1==arr[i]){
                n1=arr[i];
                temp=n1;
                System.out.println("index of n2 is:"+i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(n2==arr[i]){
                n1=n2;
                n2=temp;
                System.out.println("index of n1 is:"+i);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
