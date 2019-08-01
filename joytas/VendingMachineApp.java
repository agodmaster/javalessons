import java.util.*
import my.util.*;
public class VendingMachineApp{
	public static void main(String[] args){
		Wallet=new Wallet(1000);
		VendingMachine vm=new VendingMachine(3);
		Scanner s=new Scanner(System.in);
		while(true){
			Common.print("1. 硬貨投入 / 2. 商品購入 / 3.硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>","");
			int select=s.nextInt();
			switch(select){
				case 1:
					Common.print("投入する金額を入力して下さい >");
					int money=s.nextInt();
					vm.insertCoins(wallet.takeOutMoney(money));
			}
		}
	}
}
