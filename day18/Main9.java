import java.util.*;//メソッドを加えた前回の復習
public class Main9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("名前を入力>");
		String name=sc.next();
		int power=namePower(name);
		System.out.println("POWER:"+power);
	}
	public static int namePower(String name){
		int sum=0;
		for(int i=0;i<name.length();i++){
			sum+=name.charAt(i);
		}
		return sum;
	}
}
