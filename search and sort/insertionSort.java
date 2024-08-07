import java.util.*;
public class insertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                while(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                    if(arr[j]<arr[j+1]){
                        break;
                    }
                    
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
