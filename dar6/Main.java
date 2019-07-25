import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Maxの値を入力>");
		int max=sc.nextInt();
		int n=2;
		while(n<=max){
			System.out.println(n);
			n+=2;
		}
	}
}
