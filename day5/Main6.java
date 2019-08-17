import java.util.*;
public class Main6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("整数を入力>");
        int num=sc.nextInt();
        if(num > 0){
            System.out.println("正の値です。");
        }else if(num < 0){
            System.out.println("負の値です。");
        }else{
            System.out.println("0です");
        }
    }
}
