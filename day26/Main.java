import java.util.*;
import my.util.*;
public class Main {
	public static void main(String[] args) {
		int wizHp;
		int wizMp;
		String wizName;

		int wandPower;
		String wandName;

		Scanner sc = new Scanner(System.in);

		Hero hero = new Hero();

		Wizard wiz = new Wizard();
		Wand wand = new Wand();

		Common.print("魔法使いのパラメータを入力してください");

		System.out.print("名前 >");
		wizName = sc.nextLine();
		wiz.setName(wizName);

		System.out.print("HP >");
		wizHp = sc.nextInt();
		wiz.setHp(wizHp);

		Common.print("魔法使いのHPは"+ wiz.getHp() + "になりました");

		System.out.print("MP >");
		wizMp = sc.nextInt();
		wiz.setMp(wizMp);


		Common.print("杖のパラメータを入力してください");

		System.out.print("名前 >");
		wandName = new java.util.Scanner(System.in).nextLine();
		wand.setName(wandName);

		System.out.print("魔力 >");
		wandPower = sc.nextInt();
		wand.setPower(wandPower);

		wiz.setWand(wand);


		Common.print("ヒーローのHPは " + hero.getHp());

		wiz.Heal(hero);

		Common.print("ヒーローのHPは " + hero.getHp());
	}
}
