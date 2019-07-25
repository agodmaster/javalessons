import java.util.*;
import my.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("おさるの名前を決めてください:>");
		String name=scan.next();
		System.out.print("おさるの歳を決めてください:>");
		int age=scan.nextInt();
		Monkey monkey=new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか？1...挨拶、2...竹馬、3...逆立ち、4...終了>");
			int select =scan.nextInt();
			switch(select){
			case 1:
				monkey.greet();
				break;
			case 2:
				monkey.takeuma();
				break;
			case 3:
				monkey.sakadachi();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				scan.close();
				return;
			}
		}
	}
}
