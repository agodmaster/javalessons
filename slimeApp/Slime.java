public class Slime{//クラス
	String name="noName";//フィールド
	int hp;
	boolean isAlive=true;
	Slime(){//コンストラクタ
		this.hp=10;
	}
	Slime(String name){
		this();//同一クラス(Slime)の別コントラストが使えるつまりここでhp=10が代入される
		this.name=name;
	}
	Slime(String name,int hp){//Stringが２つ定義されてるのはオーバロードする為
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
			other.isAlive=false;//Aliveは生きてるかの意味（オリジナル）	
		}
	}
	void showStatus(){
		System.out.printf("name:%s%nhp:%d%n",this.name,this.hp);
	}
}
