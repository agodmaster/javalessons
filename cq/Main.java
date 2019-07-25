import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] msgs={"くらぇ!","こなくそ!","これでもか!"};
		System.out.println("``````````````````````");
		System.out.println("CommunicationQuest");
		System.out.println("``````````````````````");
		System.out.print("名前を入力してください>");
		String name=sc.nextLine();
		Hero h=new Hero(name);
		Tomato t1=new Tomato("トマト",20,5);
		Tomato t2=new Tomato("プチトマト",10,3);
		System.out.println(t1.name+"が現れた!");
		System.out.println(t2.name+"が現れた!");
		System.out.println("please pres enterkey");
		sc.nextLine();
		while(true){
			int n=rand.nextInt(4);
			boolean isAttack=false;
			switch(n){
			case 0:
			case 1:
				String heroMsg=msgs[rand.nextInt(msgs.length)];
				int tN=rand.nextInt(2);
				if(tN==0 && t1.isAlive){
					h.attack(t1,heroMsg);
					isAttack=true;
				}else if(tN==1 && t2.isAlive){
					h.attack(t2,heroMsg);
					isAttack=true;
				}
				break;
			case 2:
				if(t1.isAlive){
					t1.attack(h);
					isAttack=true;
				}
				break;
			case 3:
				if(t2.isAlive){
					t2.attack(h);
					isAttack=true;
				}
				break;
			}
			if(h.isAlive==false){
				System.out.println("勇者はもういない");
				System.out.println("You Lose");
				break;
			}
			if(t1.isAlive==false && t2.isAlive==false){
				System.out.println("相手を倒した!!");
				System.out.println("Win!!");
				/*return;*///そのメソッドから抜ける
				break;
			}
			if(isAttack){
				System.out.println("**********************************");
				if(h.isAlive)h.showStatus();
				if(t1.isAlive)t1.showStatus();
				if(t2.isAlive)t2.showStatus();
				System.out.println("**********************************");
				sc.nextLine();
			}
		}
		System.out.println("GameOver");
	}
}
