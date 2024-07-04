import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        String str[]=new String[n];
        System.out.println("enter Array:");
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println("Enter any number between 0 to "+(n-1)+":");
        Random rand=new Random();
        int upperbound=n;
        int random=rand.nextInt(upperbound);
        String temp="";
        System.out.println("The number is:");
        System.out.println(random);
        System.out.println("The word is:");
        for(int i=0;i<n;i++){
            if(random==i){
                System.out.println(str[i]);
                temp=str[i];
            }
        }
        System.out.println("Please Enter Any word to check anagram of \""+temp+"\":");
        String word=sc.next();
        boolean flag=false;
        for(int i=0;i<temp.length();i++){
            for(int j=0;j<word.length();j++){
                if(temp.charAt(i)==word.charAt(j)){
                    flag=true;
                    break;
                }
            }
        }
        if(flag==false){
            System.out.println("not anagram");
        }
        else{
            System.out.println("anagram");
        }
    }
}
