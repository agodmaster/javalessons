import java.util.*;
public class Lesson007{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力＞");
		int num=sc.nextInt();
		int n=2;
		while(n<=num){
			System.out.print(n+" ");
			n+=2;
		}
		if(num<=1){
			System.out.print("正の整数2以上で入力してね");
		}
		System.out.println();
	}
}
