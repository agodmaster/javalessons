import java.util.*;
import my.util.*;
public class VendingMachineApp{
	public static void main(String[] args){
		Wallet wallet=new Wallet(1000);
		VendingMachine vm=new VendingMachine(3);
		Scanner s=new Scanner(System.in);
		while(true){
			Common.print("1. 硬貨投入 / 2. 商品購入 / 3.硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>","");
			int select=s.nextInt();
			switch(select){
				case 1:
					int money=Common.input("投入する金額を入力して下さい >");
					vm.insertCoins(wallet.takeOutMoney(money));
					break;
				case 2:
					int ret=vm.purchase();
					if(ret != -1){
						wallet.insertMoney(ret);
					}
					break;
				case 3:
					ret=vm.cancel();
					wallet.insertMoney(ret);
					break;
				case 4:
					int num=Common.input("投入する個数を入力して下さい >");
					vm.insertGoods(num);
					break;
				case 5:
					wallet.display();
					break;
				case 6:
					Common.print("アプリケーションを終了します。");
					return;
			}
		}
	}
}
