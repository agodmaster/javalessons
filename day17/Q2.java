import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("ジャンケンゲーム!!");
		System.out.print("手を入力してね。0:グー,1:チョキ,2:パー>");
		int schand=sc.nextInt();
		String[] hand={"グー","チョキ","パー"};
		System.out.println("あなたは"+hand[schand]);
		int pchand=rand.nextInt(3);
		System.out.println("PCは"+hand[pchand]);
		if(schand==pchand){//引き分け予定
			System.out.println("引き分けです！");
		}else if(schand==0 && pchand==1 || schand==1 && pchand==2 || schand==2 && pchand==0){//勝ち予定
			System.out.println("あなたの勝ち！");
		}else{//負け予定
			System.out.println("あなたの負け！");
		}
	}
}
