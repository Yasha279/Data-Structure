import java.util.*;

public class Delete_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array:");
        int arr1[]=new int[5];
        int arr2[]=new int[arr1.length-1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter no. for insert:");
        int no=sc.nextInt();
        for(int i=0;i<(arr1.length+1);i++){
            if(arr1[i]<no){
                arr2[i]=arr1[i];
            }
            else if(arr1[i]>no){
                arr2[i]=arr1[i-1];
            }
            else {
                
                arr2[i]=no;
            }
        }
        
        System.out.println("Inserted Array is:"); 
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
} 
