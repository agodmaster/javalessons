public class Main4{
	public static int add(int x, int y){
		return x+y;
	}
	public static double add(double x, double y){//少数と整数のaddがなければこっちが箱が大きいのが優先される
		return x+y;
	}
	public static String add(String x, String y){
		return x+y;
	}
	public static void add(double x, int y){//少数と整数だとこちらが優先される
		System.out.println("hoge");
	}
	/*
	public static void add(int x,int y){
		System.out.println(x+y);
	}
	*/
	//はコンパイルエラー
	public static void main(String[] args){
		System.out.println(add(10,20));
		System.out.println(add(3.5,2.7));
		System.out.println(add("Hello","World"));
		add(2.5,10);
	}
}
