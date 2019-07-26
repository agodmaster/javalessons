import java.util.*;
import my.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Common.print("最初に給紙する枚数を入力して下さい >","");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		CopyMachine cm=new CopyMachine(num);
		while(true){
			Common.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>","");
			int select=s.nextInt();
			switch(select){
			case 1:
				Common.print("給紙する枚数を入力して下さい >","");
				num=s.nextInt();
				cm.feedPaper(num);
				break;
			case 2:
				Common.print("コピーする枚数を入力して下さい >","");
				num=s.nextInt();
				cm.copy(num);
				break;
			case 3:
				cm.display();
				break;
			default:
				Common.print("アプリケーションを終了します。");
				return;
			}
		}
	}
}
