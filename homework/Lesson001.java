import java.util.*;
public class Lesson001{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("２つの整数を入力してください。");
		System.out.print("整数1＞");
		int integer=sc.nextInt();
		System.out.print("整数2＞");
		int integer2=sc.nextInt();
		System.out.printf("%n%d と %d  の合計は  %d  です。%n",integer,integer2,integer+integer2);
	}
}
