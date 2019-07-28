import java.util.Scanner;
import my.util.*;
public class PoolApp{
	public static void main(String[] args){
		Pool pool=new Pool();
		Scanner s=new Scanner(System.in);
		while(true){
			Common.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>","");	
			int select=s.nextInt();
			switch(select){
			case 1:
				double water;
				do{
					Common.print("給水する水量を入力して下さい >","");
					water=s.nextDouble();
					if(water<0){
						Common.print("[給水量は正の値をいれてください。]");
					}
				}while(water < 0);
				pool.feedWater(water);
				break;
			case 2:
				do{
					Common.print("排水する水量を入力して下さい >","");
					water=s.nextDouble();
					if(water<0){
						Common.print("[排水量は正の値をいれてください。]");
					}
				}while(water < 0);
				pool.drainWater(water);
				break;
			case 3:
				pool.display();
				break;
			default:
				Common.print("アプリケーションを終了します。");
				s.close();
				System.exit(0);
			}
		}
	}
}
