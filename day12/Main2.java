import java.util.Random;
public class Main2{
	public static void main(String[] args){
		String[] fortunes={"大吉","中吉","吉","凶"};
		Random rand=new Random();
		int index=rand.nextInt(fortunes.length);
		System.out.println("本日の運勢は"+fortunes[index]);
	}
}
