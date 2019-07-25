import java.util.*;
public class Main6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数>");
		int n=sc.nextInt();
		System.out.println(maxPrime(n));
	}
	static boolean isPrime(int n){//trueかfalseかの判定を行い返すメソッド
		if(n<=1){//ひねくれ者対策で1より低い数値は受け付けない
			return false;
		}
		for(int i=2;i<n;i++){//素数ならifを抜ける
			if(n%i==0){//素数じゃない場合はその時点でfalse
				return false;
			}
		}
		return true;
	}
	static int maxPrime(int n){
		int prime=-1;//ひねくれ者対策で０じゃなくマイナス１
		for(int i=n;i>=2;i--){
			if(isPrime(i)){//true/falseの判定
				prime=i;//trueだった場合iの値をprimeに入れてbreakで抜ける
				break;
			}
		}
		return prime;
	}
}
