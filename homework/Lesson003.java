import java.util.*;
public class Lesson003{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数１を入力＞");
		int num=sc.nextInt();
		System.out.print("整数２を入力＞");
		int num2=sc.nextInt();
		System.out.print("整数３を入力＞");
		int num3=sc.nextInt();
		int max=Math.max(num,num2);
		max=Math.max(max,num3);
		int min=Math.min(num,num2);
		min=Math.min(min,num3);
		int dif=max-min;
		System.out.println("最も大きい整数"+max+"と");
		System.out.println("最も小さい整数"+min+"の差は"+dif+"です。");

	}
}
