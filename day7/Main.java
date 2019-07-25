import java.util.*;
public class Main{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("１〜１００の番号決めたよ当ててね");
		int ans=rand.nextInt(100)+1;
		int number;
		int count=0;
		do{
			count++;
				System.out.print("いくつかな？>");
			number=sc.nextInt();
			if (number==ans){
				System.out.println("当たり");
				break;
			}
			if(number>ans){
				System.out.println("もっと下だよ");
			}else if(number<ans){
				System.out.println("もっと上だよ");
			}
		}while(number != ans && count<5);
			if(ans != number){
				System.out.printf("残念〜正解は%dでした",ans);
			}
	}
}
