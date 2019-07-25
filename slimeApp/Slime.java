public class Slime{//クラス
	String name="noName";//フィールド
	int hp;
	boolean isAlive=true;
	Slime(){//コンストラクタ
		this.hp=10;
	}
	Slime(String name){
		this();
		this.name=name;
	}
	Slime(String name,int hp){
		this(name);
		this.hp=hp;
	}
	void appear(){
		System.out.println(this.name+"が現れた!");
	}
	void attack(Slime other){
		System.out.println(this.name+"が攻撃!");
		System.out.println(other.name+"に3pointのダメージを与えた");
		other.hp-=3;
		if(other.hp<=0){
			other.isAlive=false;	
		}
	}
	void showStatus(){
		System.out.printf("name:%s%nhp:%d%n",this.name,this.hp);
	}
}
