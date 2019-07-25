public class Main{
	public static void main(String[] name){
		hello();
		aisatsu();
		aisatsu();
		hello("山下");
		hello("山本");
		add(3,5);
		add(4,-20);
	}
	public static void hello(){
		System.out.println("こんにちは");
	}
	public static void aisatsu(){
		hello();
		System.out.println("hello");
		System.out.println("bye");
	}
	public static void hello(String name){//引数
		System.out.println(name+"さん、こんにちは");
	}
	public static void add(int a, int b){
		System.out.printf("%dと%dを足すと%dです%n",a,b,a+b);
	}
}
