import java.util.*;
public class Main3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数>");
		int n=sc.nextInt();
		System.out.println(method(n));

	}
	static int method(int n){
		if(n==1){//階乗を求める
			return n;
		}else{
			return n*method(n-1);
		}
	}
}
