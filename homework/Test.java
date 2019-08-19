public class Test{
	private int second=0;
	public void set_second(int s){
		second=s;
	}
	public void set_minute(int m){
		second=m * 60;
	}
	public void set_hour(double h){
		second=(int)(h * 3600.0);
	}
	public int get_hour(){
		return second / 3600;
	}
	public int get_minute(){
		return (second / 60) % 60;
	}
	public int get_second(){
		return second % 60;
	}
}
