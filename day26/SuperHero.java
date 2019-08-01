import my.util.*;
public class SuperHero extends Hero2{
	private boolean flying;
	int n;
	public void fly(){
		this.flying=true;
		Common.print("飛び上がった！");
	}
	public void land(){
		this.flying=false;
		Common.print("着地した！");
	}
	public void run(){
		Common.print("撤退した！");
		n=sc.nextInt();
	}
}
