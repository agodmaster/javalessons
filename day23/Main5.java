import java.util.*;
public class Main5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数A>");
		int a=sc.nextInt();
		System.out.print("整数b>");
		int b=sc.nextInt();
		System.out.println("gcdは"+gcdOf(a,b)+"です。");
	}
	static int gcdOf(int a,int b){
		int mod=a%b;//に余りをmodに代入
		if(mod==0){//modが0になるまで繰り返し
			return b;//trueならその時点の数値のbをreturn
		}else{
			return gcdOf(b,mod);//割り切るまで繰り返す
		}
	}
}
