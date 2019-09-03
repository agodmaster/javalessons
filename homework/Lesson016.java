import java.util.*;
public class Lesson016{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力＞");
		int integer=sc.nextInt();
		for(int i=0;i<integer;i++){
			for(int j=0;j<integer;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
