import java.util.*;
//if文の省略比較練習
public class Mimain{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("整数A:");
		int a=scan.nextInt();
		System.out.print("整数B:");
		int b=scan.nextInt();
		if(a<b){
			System.out.println("小さい方の数は"+a+"です。");
		}else{
			System.out.println("小さい方の数は"+b+"です。");
		}
		scan.close();
	}
}
