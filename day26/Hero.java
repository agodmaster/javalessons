public class Hero{
	private String name;
	private int hp;
	public Hero(){
		this.hp=10;
		this.name="勇者";
	}
	public String getName(){return this.name;}
	public int getHp(){return this.hp;}
	public void setHp(int hp){this.hp=hp;}
}
