import java.util.*;
public class Main2{
	static double area(double i, double j){
		return i*j/2;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("底辺>");
		double Bottom=sc.nextDouble();
		System.out.print("高さ>");
		double Height=sc.nextDouble();
		double result=area(Bottom,Height);//ここでメソッドsreaに指令
		System.out.println("底辺:"+Bottom+",高さ:"+Height+"の三角形の面積は"+result+"です。");
	}
}
