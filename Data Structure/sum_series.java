import java.util.*;
public class sum_series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int sum=0;
        int sum1=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            sum1=sum1+sum;
        }
        System.out.println(sum1);
    }
}
