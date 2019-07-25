public class Tomato{
	String name;
	int hp;
	int attackPower;
	boolean isAlive=true;
	Tomato(String name,int hp,int attackPower){
		this.name=name;
		this.hp=hp;
		this.attackPower=attackPower;
	}
	void attack(Hero h){
		System.out.print(this.name+"が"+h.name+"を攻撃!");
		System.out.println("くらえ！");
		int dice=new java.util.Random().nextInt(10);
		int ap;
		if(dice==0){
			ap=this.attackPower*2;
			System.out.println("会心の攻撃！！");
		}else{
			ap=this.attackPower+new java.util.Random().nextInt(5)-2;
		}
		System.out.println(ap+"ポイントのダメージ");
		h.hp-=ap;
		if(h.hp<=0){
			System.out.println(h.name+"は倒れた");
			h.isAlive=false;
		}
	}
	void showStatus(){
		System.out.printf("%s.HP %d%n",this.name,this.hp);
	}
}
