import java.util.*;
public class Lesson012{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=1;
		int total=0;
		while(true){
			System.out.print("数値の"+count+"を入力＞");
			int num=sc.nextInt();
			if(num==0){
				break;
			}else{
				total+=num;
				count++;
			}
		}
		count--;
		System.out.println("合計は"+total+"です。");
		System.out.println("平均は"+total/count+"です。");
	}
}
