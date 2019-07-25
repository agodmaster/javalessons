import java.util.*;
public class Q21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] Hands={"グー","チョキ","パー"};
		System.out.println("ジャンケンゲーム!!");
		System.out.print("手を入力してね。0:グー,1:チョキ,2:パー>");
		int userHand=sc.nextInt();
		int pcHand=rand.nextInt(Hands.length);
		System.out.println("あなたは"+Hands[userHand]);
		System.out.println("PCは"+Hands[pcHand]);
		/*
		if(userHand==pcHand){
			System.out.println("引き分けです");
		}else if(userHand==0 && pcHand==1 || userHand==1 && pcHand==2 || userHand==2 && pcHand==0){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
		*/
		int diff=(userHand+3-pcHand)%3;
		if(diff==2){//2で割り切る時勝ち
			System.out.println("あなたの勝ちです");
		}else if(diff==0){//0の時引き分け
			System.out.println("引き分けです");
		}else{//それ以外負け
			System.out.println("あなたの負けです");
		}
	}
}
