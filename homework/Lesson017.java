import java.util.*;
public class Lesson017{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力＞");
		int integer=sc.nextInt();
		int count=1;
		for(int i=0;i<integer;i++){
			for(int j=0;j<count;j++){
				System.out.print("* ");	
			}
			count++;
			System.out.println();
		}
	}
}
