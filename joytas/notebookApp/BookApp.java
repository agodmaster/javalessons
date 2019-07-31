import my.util.*;
import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Common.print("本のページ数を入力して下さい >","");
		int page=sc.nextInt();
		Common.print("本の価格を入力して下さい >","");
		int price=sc.nextInt();
		Book book=new Book(page,price);
		Common.print("ノートのページ数を入力して下さい >","");
		page=sc.nextInt();
		Common.print("ノートの価格を入力して下さい >","");
		price=sc.nextInt();
		NoteBook notebook=new NoteBook(page,price);
		while(true){
			Common.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>","");
			int select=sc.nextInt();
			switch(select){
			case 1:
				book.pagePrice();
				break;
			case 2:
				notebook.pagePrice();
				break;
			case 3:
				Common.print("書き込む内容を入力して下さい >","");
				String str=sc.next();
				notebook.append(str);
				break;
			case 4:
				Common.print("アプリケーションを終了します。");
				return;
			}
		}
	}
}
