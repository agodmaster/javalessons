import java.util.*;
public class Lesson010{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数１を入力。");
		int num=sc.nextInt();
		System.out.print("整数２を入力＞");
		int num2=sc.nextInt();
		System.out.print("偶数(1)・奇数(2)を選択＞");//分岐選択
		int select=sc.nextInt();//分岐用整数
		int max=0;//maxの値代入用
		int min=0;//min同上
		int sum=0;//合計を入れる箱
		if(num <= num2){//大小の入れ替え
			max = num2;
			min = num;
		}else{
			max = num;
			min = num2;
		}
		switch(select){//分岐
		case 1://偶数の合計
			for(int i = max ; i >= min ; i--){
				if(i %2 == 0){//2で割り切れる時
					sum+=i;
				}
			}
			System.out.print(min+"から"+max+"までの偶数の合計は"+sum+"です。 ");
			break;
		case 2://奇数の合計
			for(int i = max ; i > min ; i--){
				if(i %2 != 0){//2で割り切れない時
					sum+=i;
				}
			}
			System.out.print(min+"から"+max+"までの奇数の合計は"+sum+"です。 ");
			break;
		default:
			System.out.print("アプリを終了します");
			return;
		}
	}
}
