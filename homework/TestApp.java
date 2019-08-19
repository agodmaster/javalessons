public class TestApp{
	public static void main(String[] args){
		Test mt=new Test();
		int s,m;
		double h;
		s=3485;
		mt.set_second(s);
		System.out.println();
		System.out.println(s + "秒=" + mt.get_hour() + "時間" + mt.get_minute() + "分"  + mt.get_second() + "秒");
	}
}
