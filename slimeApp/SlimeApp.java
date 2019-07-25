import java.util.*;
import my.util.*;
public class SlimeApp{
	public static void main(String[] args)throws Exception{
		String name=Common.inputStr("あなたのスライムの名前を決めてください>");
		Random rand=new Random();
		int hp=rand.nextInt(8)+8;
		Common.print("あなたのスライムが誕生しました！");
		Slime slime=new Slime(name,hp);
		slime.showStatus();
		Thread.sleep(300);
		Common.print(".");
		Thread.sleep(300);
		Common.print(".");
		Thread.sleep(300);
		Common.print(".");
		Slime other=new Slime("スラリン");
		other.appear();
		while(slime.isAlive && other.isAlive){
			int n=rand.nextInt(2);
			if(n==0){
				slime.attack(other);
			}else{
				other.attack(slime);
			}
			slime.showStatus();
			other.showStatus();
		}
		if(slime.isAlive){
			Common.print("You Win!");
		}else{
			Common.print("You Lose...");
		}
	}
}
