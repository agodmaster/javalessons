import java.util.*;
public class Main3{
	static int maxOf(int i, int j, int k){
		int max=i;
		if(j>max){
			max=j;
		}
		if(k>max){
			max=k;
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数A>");
		int integer=sc.nextInt();
		System.out.print("整数B>");
		int integerB=sc.nextInt();
		System.out.print("整数C>");
		int integerC=sc.nextInt();
		int max=maxOf(integer,integerB,integerC);//maxの名前はmaxOfのmaxと違っても大丈夫
		System.out.println("最大値は"+max);
	}
}
