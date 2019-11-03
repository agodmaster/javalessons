import java.util.*;
public class Lesson018{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力してね");
		int integer=sc.nextInt();
		for(int i=0;i<integer;i++){
			for(int j=0;j<integer+i;j++){
				if(j != integer){
					System.out.print("* ");
				}else{
					System.out.print("＋");
				}
			}
			System.out.println();
				/*j+=count;
				if(j != integer){
					System.out.print(" *");
				}else{
					System.out.print("* ");
				}
				count++;*/
		}
	}
}
