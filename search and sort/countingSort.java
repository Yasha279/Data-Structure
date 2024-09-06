import java.util.*;
public class countingSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Input array a is:");
        for(int i=1;i<=a.length;i++){
            a[i]=sc.nextInt();
        }

        int max=a[1];
        for(int i=1;i<=a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int c[]=new int[max+1];
        for(int i=1;i<=c.length;i++){
            c[a[i]]=c[a[i]]+1;
        }
        for(int i=2;i<=a.length;i++){
            c[i]=c[i]+c[i-1];
        }
        int b[]=new int[a.length];
        System.out.println("sorted array b is:");
        for(int i=a.length;i>0;i--){
            b[c[a[i]]]=a[i];
            c[a[i]]=c[a[i]]-1;
        }
        for(int i=1;i<=b.length;i++){
            b[i]=sc.nextInt();                                         
        }
    }
}
