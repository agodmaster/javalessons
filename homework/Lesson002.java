import java.util.*;
public class Lesson002{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力してください。＞");
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num){
			sum+=i;
			i++;
		}
		System.out.println("1 から "+num+"  までの合計は、 "+sum+" です。");
	}
}
