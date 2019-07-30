import my.util.*;
public class VendingMachine{
	private int money;
	private int num;
	public VendingMachine(int n){
		this.insertGoods(n);
		this.insertCoins(0);
	}
	public void insertCoins(int money){
		this.money+=money;
		System.out.printf("現在の入金額:%d円%n",this.money);
	}
	public int cancel(){
		int m=this.money;
		this.money=0;
		System.out.printf("現在の入金額：%d円%n",this.money);
		return m;
	}
	public int purchase(){
		if(this.money<100){
			Common.print("等入金額が足りません");
			return -1;
		}
		if(this.num<1){
			Common.print("商品売切れ");
			return -1;
		}
		this.money-=100;
		this.num--;
		return cancel();
	}
	public void insertGoods(int num){
		this.num+=num;
	}
}
