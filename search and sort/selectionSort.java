import java.util.*;
public class selectionSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter array:");
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n-i-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}