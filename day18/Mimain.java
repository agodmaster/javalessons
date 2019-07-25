import java.util.*;
public class Mimain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("あなたの年齢>");
		int age=sc.nextInt();
		System.out.print("あなたの名前>");
		String name=sc.nextLine();
		System.out.printf("%d才の%sさん、こんにちは%n",age,name);
	}
}
