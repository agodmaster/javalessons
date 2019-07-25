import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("どこまで>");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}
