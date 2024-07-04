import java.util.*;
public class Time {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter seconds:");
        int sec=sc.nextInt();
        int min=0;
        int hour=0;
        for(int i=0;i<sec;i++){
            if(sec>=60){
                sec-=60;
                min++;
            }
        }
        for(int i=0;i<min;i++){
            if(min>=60){
                min-=60;
                hour++;
            }
        }
        System.out.println(""+hour+":"+min+":"+sec);
    }
}
