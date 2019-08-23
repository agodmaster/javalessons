import java.util.*;
public class Test2{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int sum = 0; //合計を保存するための変数
	int a=0;
	while (true) {
		System.out.println("数値を繰り返し入力して下さい(0で合計と平均をだして終了)"); //メッセージに終了条件を追加
		int num = scan.nextInt();
		if (num == 0) {
			break;
		} else {
			sum += num;
			a++;//おわるまで加算していく
		}
	}
	System.out.println("合計は"+sum);
	System.out.println("平均は"+sum/a);
	}
}
