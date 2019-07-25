public class Hero{
	String name;
	int hp;
	int attackPower;
	boolean isAlive=true;
	Hero(){
		this.hp=30;
		this.attackPower=7;
	}
	Hero(String name){
		this.hp=30;
		this.attackPower=7;
		this.name=name;
	}
	Hero(String name,int hp,int attackPower){
		this.name=name;
		this.hp=hp;
		this.attackPower=attackPower;
	}
	void attack(Tomato t,String msg){
		System.out.print(this.name+"が"+t.name+"を攻撃!");
		System.out.println(msg);
		int dice=new java.util.Random().nextInt(10);
		int ap;
		if(dice==0){
			ap=this.attackPower*2;
			System.out.println("会心の攻撃！！");
		}else{
			ap=this.attackPower+new java.util.Random().nextInt(5)-2;
		}
		System.out.println(ap+"ポイントのダメージ");
		t.hp-=ap;
		if(t.hp<=0){
			System.out.println(t.name+"は倒れた");
			t.isAlive=false;
		}
	}
	void showStatus(){
		System.out.printf("%s.HP %d%n",this.name,this.hp);
	}
}
