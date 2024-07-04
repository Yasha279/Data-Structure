import java.util.*;
public class Day {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter days:");
        int day=sc.nextInt();
        int month=0;
        int year=0;
        for(int i=1;i<=day;i++){
            if(day>=30){
                day-=30;
                month++;
            }
        }
        for(int i=1;i<=month;i++){
            if(month>=12){
                month-=12;
                year++;
            }
        }
        System.out.println(""+year+"years, "+month+"month, "+day+"days");
    }
}

