import java.util.*;
public class Lesson014{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("正の整数を入力＞");
		int integer = sc.nextInt();
		for(int i = 1;i <= integer; i++){
			if( i%2 == 0 || i%3 == 0 ){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
	}
}
