import java.util.*;
public class Main3{
	public static void main(String[] args){
		Random rand=new Random();
		final int NUM_COUNT=10;//定数名は大文字
		int[] nums=new int[NUM_COUNT];//配列にfinal付ける場合final整数をあらかじめ作ってそれをこのように代入します
		System.out.print("生成した数値");
		for(int i=0;i<nums.length;i++){
			int n=rand.nextInt(101);
			System.out.print(n);
			if(i<nums.length-1){
				System.out.printf(",");
			}
			nums[i]=n;
		}
		System.out.print("\n偶数:");
		String evenStr="";
		for(int n:nums){
			if(n % 2==0){
				evenStr+=n;
				evenStr+=",";
			}
		}
		evenStr=evenStr.substring(0,evenStr.length()-1);
		System.out.println(evenStr);
	}
}
