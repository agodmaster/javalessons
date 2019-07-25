import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("10月は英語で何?");
		String ans=sc.nextLine();
		if (ans.equals("October")){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
	}
}
