import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for search:");
        int a=sc.nextInt();
        boolean flag=false;
        int arr[]= new int[5];
        System.out.println("enter array of numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println(""+a+" have duplicate number");
        }
        else{
            System.out.println(""+a+"no duplicate number");
        }
    }
}