import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("体重>");
        double t=sc.nextDouble();
        System.out.print("身長>");
        double s=sc.nextDouble();
        s/=100;
        double bm=t/(s*s);
        System.out.printf("あなたのBMIは%5dです。",bm);
    }
}
