import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("どこまで>");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++){
			//sum+=i;
			sum=sum+i;//と上記同じ
		}
		System.out.printf("1から%dまでの和は%dです%n",n,sum);//改行を最後にしないとエラーになることもあるので癖をつけると良い
	}
}
