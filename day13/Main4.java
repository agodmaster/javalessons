/*個人のまとめ（ポールゲームユーザーに聞くver）*/
import java.util.*;
public class Main4{//実行例通りver
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 Random rand=new Random();
		 /*１０個の番号付きボールが入った袋の配列*/
		 int[] nums=new int[]{1,2,3,4,5,6,7,8,9,10};
		 int Mother=0;//母の番号管理
		 int Kids=0;//子供の番号管理
		 /*ここでユーザーに何ターン引かせるか求める*/
		 System.out.print("何ターン行いますか(1~5)>");
		 int turn=sc.nextInt();
		 for(int i=0;i<turn*2;i++){//母と子の二人に引かせたいので*2
		 	if(i%2==0){//Mother引く番
				/*indexに配列の箱からランダムにボールを一個取る*/
				int index=rand.nextInt(nums.length-i);//-iで一個取る
				/*%nで両サイド改行し縦に並ぶように表示する*/
		 		System.out.printf("%nMother%n"+nums[index]);
				int temp=nums[index];
				Mother+=nums[index];
				nums[index]=nums[nums.length-1-i];
				nums[nums.length-1-i]=temp;
			}else{//Kidsが弾く番
				int index=rand.nextInt(nums.length-i);
		 		System.out.printf("%nKids%n"+nums[index]);
				int temp=nums[index];
				Kids+=nums[index];
				nums[index]=nums[nums.length-1-i];
				nums[nums.length-1-i]=temp;
			}
		 }
		 	System.out.println();
		 	System.out.printf("%nResult%n");
		 	System.out.println("Mother "+Mother);
		 	System.out.println("Kids "+Kids);
			if(Kids<Mother){
				System.out.printf("%nMother Win!%n");
			}else{
				System.out.printf("%nKids Win!%n");
			}
	}
}
