import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("体重(kg)>");
        double weight=sc.nextDouble();
        System.out.print("身長(cm)>");
        double height=sc.nextDouble();
        height/=100; //cmをmに変換
        double bmi=weight/(height*height);
        System.out.printf("あなたのBMIは%.2fです。",bmi);

    }
}
