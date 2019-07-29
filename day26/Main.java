import java.util.*;
import my.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Hero h=new Hero();
		Wand wand=new Wand();
		Wizard w=new Wizard();
		w.setWand(wand);
		Common.print(h.getHp());
		w.heal(h);
	}
}
