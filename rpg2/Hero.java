public class Hero{
	private String name="ミナト";
	private int hp=100;
	public void attack(Matango m){
		System.out.println(this.getName()+"の攻撃！");
		m.hp -=5;
		System.out.println("5ポイントのダメージをあたえた");
	}
	public final void slip(){
		this.hp -=5;
		System.out.println(this.getName()+"は転んだ！");
		System.out.println("5のダメージ");

	}
	public void run(){
		System.out.println(this.getName()+"は逃げ出した！");
	}
	public String getName(){
		return this.name;
	}
}
