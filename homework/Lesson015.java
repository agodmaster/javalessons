import java.util.*;
public class Lesson015{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("今日の年は？＞");
		int year=sc.nextInt();
		System.out.print("今日の月は？＞");
		int moon=sc.nextInt();
		System.out.print("今日の日は？＞");
		int day=sc.nextInt();
		System.out.print("誕生日の年は？＞");
		int birtYear=sc.nextInt();
		System.out.print("誕生日の月は？＞");
		int birtMoon=sc.nextInt();
		System.out.print("誕生日の日は？＞");
		int birtDay=sc.nextInt();
		//誕生日とその日の年(year)の差をとり、年齢にする。
		int age=year-birtYear;
		//誕生日の月とその日の月と比較
		if(moon < birtMoon){//誕生日の月のが大きいなら
			age--;//年齢から1引く
		//誕生日の月とその日の月が同じなら
		}else if(moon == birtMoon){//誕生日の日とその日を比較
			if(day < birtDay){//誕生日の日の方が大きい場合
				age--;
			}
		}
		//ageに年齢を返す
		System.out.println("あなたの年齢は"+age+"歳です。");
	}
}
