import my.util.*;
public class Main2{
	public static void main(String[] args){
		int a=Common.input("正の整数a>");
		int b=Common.input("正の整数b>");
		while(true){
			int select=Common.input("番号を入力1.和,2.差,3.積,4.最大公約数,5.終了>");
			switch(select){//スイッチは番号誘導ぐらい
			case 1:
				Common.print(a+b);
				break;//ブレイクでswitchを抜けてwhileに戻る
			case 2:
				Common.print(a-b);
				break;
			case 3:
				Common.print(a*b);
				break;
			case 4:
				Common.print(Common.gcd(a,b));
				break;
			default:
				Common.print("アプリを終了します");
				return;//returnでメソッドを抜けて行く宛もないので終了
			}
		}
	}
}
