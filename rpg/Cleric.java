public class Cleric{
	String name;
	int hp;
	int mp;
	final int MAX_HP=50;
	final int MAX_MP=10;
	void selfAid(){
		this.mp-=5;
		this.hp=MAX_HP;
	}
	int pray(int sec){
		java.util.Random rand=new java.util.Random();
		int n=rand.nextInt(3);
		n=n+sec;
		if(this.mp+n>MAX_MP){
			n=MAX_MP-this.mp;//MAXからMPを引いた数を回復する
		}
		this.mp+=n;
		return n;
	}
}
