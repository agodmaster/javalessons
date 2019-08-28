import java.util.*;
import my.util.*;
public class Lesson013{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<>();
		map.put("apple", "りんご");
		map.put("banana", "バナナ");
		map.put("peach", "もも");
		String exit="exit";
		while(true){
			String input=Common.inputStr("英単語を入力してください>");
			Common.print("");
			if(map.containsKey(input)){
				Common.print(input+"->"+map.get(input));
			}else if(input.equals(exit)){
				Common.print("アプリケーションを終了します。");
				break;
			}else{
				Common.print("その単語は登録されていません。");
			}
			Common.print("");
		}
	}
}
