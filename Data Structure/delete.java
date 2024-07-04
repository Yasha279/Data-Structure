import java.util.*;
public class delete {
    


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter array size:");
        n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter location for delete element:");
        int loc=sc.nextInt();
        for(int i=0;i<arr1.length;i++){
            if(i==loc){
                for(int j=i;j<arr1.length-1;i++){
                    arr1[j]=arr1[j+1];
                }
                
            }
        }
        
         
        for(int i=0;i<arr1.length-1;i++){
            System.out.println(arr1[i]);
        }
    }
}

