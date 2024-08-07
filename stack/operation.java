import java.util.*;
public class operation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of stack:");
        int n=sc.nextInt();
        System.out.println("enter stack:");
        stack st=new stack(n);
        for(int i=0;i<5;i++){
        System.out.println("enter 1.For PUSH, 2.For POP, 3.For PEEP, 4.For CHANGE, 5.For DISPLAY");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                st.push(3);
                st.push(4);
                st.push(5);
                st.printStack();
                break;
            case 2:
                st.pop();
                st.printStack();
                break;
            case 3:
                st.peep(0);
                st.printStack();
                break;
            case 4:
                st.change(5,1);
                st.printStack();
                break;
            case 5:
                st.display();
                break;
            default:
                System.out.println("invalid");
                break;
        }
    
        }
    }
    static class stack{
        int top;
        int max;
        int s[];
        public stack(int size){
            max=size;
            top=-1;
            s=new int[size];
        }
        public void printStack() {
            for (int i = 0; i <= top; i++) {
              System.out.print(s[i] + ", ");
            }
          }
        public void push(int x){
            if(top>=max){
                System.out.println("stack overflow");
            }
            else{
                top++;
                s[top]=x;
                return;
            }
        }
        public int pop(){
            if(top<-1){
                System.out.println("stack underflow");
                return 0;
            }
            else{
                top--;
                return (s[top]);
            }
        }
        public int peep(int i){
            if((top-i+1)<=0){
                System.out.println("stack underflow");
                return 0;
            }
            else{
                return (s[top-i+1]);
            }
        }
        public void change(int x,int i){
            if((top-i+1)<=0){
                System.out.println("stack underflow");
                return;
            }
            else{
                s[top-i+1]=x;
                return;
            }
        }
        public void display(){
                for (int i = 0; i <= top; i++) {
                    System.out.print(s[i] + ", ");
                  }
            
    }
}  
}  
