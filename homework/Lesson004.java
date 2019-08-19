import java.util.*;
public class Lesson004{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("秒を入力＞");
		int sec=sc.nextInt();
		int hour=sec/3600;
		int min=(sec%3600)/60;
		sec=sec % 60;
		if(sec <= 10){
			System.out.println(hour+"時間"+min+"分0"+sec+"秒です。");
		}else{
			System.out.println(hour+"時間"+min+"分"+sec+"秒です。");
		}
	}
}
