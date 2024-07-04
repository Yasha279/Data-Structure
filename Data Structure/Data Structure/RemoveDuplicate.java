import java.util.*;
public class RemoveDuplicate
{
public static void main(String[] args) {
System.out.println("enter size and elements");
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int arr[] = new int [n];
for(int i =0; i<n; i++){
arr[i]= sc.nextInt();
}
int temp [] = new int [n];
int j =0;
Arrays.sort(arr);

for(int i =0; i<n-1; i++){
if(arr[i]!=arr[i+1])
temp[j++]=arr[i];
}
temp[j++]=arr[n-1];
for(int k =0; k<j; k++){
System.out.print(temp[k] + " ");
}
}
}