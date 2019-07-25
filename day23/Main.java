import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数");
		int n=sc.nextInt();
		countdown(n);
	}
	static void countdown(int n){
		//再帰処理(recursive)
		if(n==1){
			System.out.println(n);
		}else{
			System.out.println(n--);
			countdown(n);//自分自身を呼び出し
		}
		/*
		再帰前
		for(int i=n;i>=1;i--){
			System.out.println(n);
		*/
	}
}
