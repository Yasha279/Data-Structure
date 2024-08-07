import java.util.*;
import java.util.Stack;
public class prefixNotation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        String infix = sc.nextLine();
        char c;
        String polish="";
        int Rank=0;
 
        Stack<Character> charStack = new Stack<>();

        charStack.push('(');

        for(int i=infix.length()-1;i<=0;i++){
            char next=infix.charAt(i);
        if(charStack.size()<1){
            System.out.println("invalid string");
        }
           while((g(charStack.peek()))>(f(next))){
            
           char temp= charStack.pop();
            polish+=temp;
            Rank+=r(temp);
                if(Rank<1){
                    System.out.println("Invalid");
                }
           }
           
           if(g((charStack.peek()))!=f(next)){
            charStack.push(next);
           }else{
            charStack.pop();
           }
            
         }
         System.out.println("Prefix expression is: " + polish);
         if(Rank!=1){
            System.out.println("invalid");
         }else{
            System.out.println("valid");
         }
    }
    public static int f(char c){
        if(c=='(')return 9;
        else if(c==')') return 0;
        else if(c=='^') return 6;
        else if(c=='*'||c=='/')return 3;
        else if(c=='+'||c=='-') return 1;
        else return 7;
    }
    public static int g(char c){
        if(c=='(')return 0;
        else if(c=='^') return 5;
        else if(c=='*'||c=='/')return 4;
        else if(c=='+'||c=='-') return 2;
        else return 8;
    }
    public static int r(char c){
        if(c=='^') return -1;
        else if(c=='*'||c=='/')return -1;
        else if(c=='+'||c=='-') return -1;
        else return 1;
    }
  }
