import java.util.*;
public class Lesson009{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力＞");
		int num=sc.nextInt();
		int i=1;
		int def=num;
		int sum=0;
		while(i<=num){
			sum+=i;
			i++;
		}
		System.out.println(def+"までの正の整数の合計は、"+sum+"です。");
	}
}
