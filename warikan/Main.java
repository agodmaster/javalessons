package main;
import logic.Logic;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何人>");
		int n=sc.nextInt();
		System.out.print("いくら>");
		int cost=sc.nextInt();
		int per=Logic.calc(n,cost);
		System.out.println("一人当たりの金額は"+per+"円です");
	}
}
