public class Main{
	public static void main(String[] args){
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		System.out.println("勇者"+h.name+"を生み出しました！");
		Hero h2=new Hero();
		h2.name="ロト";
		h2.hp=1000;
		System.out.println("勇者"+h2.name+"を生み出しました！");
		h.slip();
		h2.sit(10);
		System.out.println(h.name+"のHP"+h.hp);
		System.out.println(h2.name+"のHP"+h2.hp);
		Hero h3=new Hero();
		h3.name="ジェシカ";
		h3.hp=50;
		h3.sleep();
		h3.run();
		Cleric cl=new Cleric();
		cl.name="エルス";
		cl.hp=30;
		cl.mp=10;
		cl.selfAid();
		cl.pray(5);
		System.out.printf("%sのHP.%d.MP.%d%n",cl.name,cl.hp,cl.mp);
	}
}
