import java.util.*;
import my.util.*;
public class Lesson013{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] fruit=new String[]{"apple","banana","peach","exit"};
		while(true){
			System.out.print("英単語を入力してください>");
			String select=sc.next();
			System.out.println();
			if(select.equals(fruit[0])){
				System.out.println(select+"->りんご");
			}else if(select.equals(fruit[1])){
				System.out.println(select+"->バナナ");
			}else if(select.equals(fruit[2])){
				System.out.println(select+"->もも");
			}else if(select.equals(fruit[3])){
				System.out.println("アプリケーションを終了します。");
				break;
			}else{
				System.out.println("その単語は登録されていません。");
			}
			System.out.println();
		}
	}
}
