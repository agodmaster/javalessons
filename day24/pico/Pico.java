import java.util.*;
public class Pico{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("右手に何を持ちますか>");
		String rHand=sc.nextLine();
		System.out.println("I have a"+rHand+".");
		System.out.print("左手に何を持ちますか>");
		String lHand=sc.nextLine();
		System.out.println("I have a"+lHand+".");
		System.out.println(lHand+rHand+"!");
		System.out.print("左手に何を持ちますか>");
		String lHand2=sc.nextLine();
		System.out.println("I have a"+lHand2+".");
		System.out.print("右手に何を持ちますか>");
		String rHand2=sc.nextLine();
		System.out.println("I have a"+rHand2+".");
		System.out.println(rHand2+lHand2+"!");
		System.out.printf("%n%s-%s%n",lHand+rHand,rHand2+lHand2);
		System.out.printf("%n%s%s%n",rHand2+lHand2,lHand+rHand);
	}
}
