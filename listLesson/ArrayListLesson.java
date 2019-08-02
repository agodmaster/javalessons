import java.util.*;
import my.util.*;
public class ArrayListLesson{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		Common.print("ArrayListを使ってみよう！");
		Common.print("Listに数字をどんどん追加していってみよう。");
		while(true){
			int n=Common.input("要素追加するよ数字を入れてね(0で終了):");
			if(n==0){
				break;
			}
			list.add(n);
			Common.print(n+"をListに追加したよ！");
		}
		Common.print("ーー結果ーー");
		Common.print("要素数:"+list.size());
		Common.print("要素:","");
		for(int i:list){
			Common.print(i,",");
		}
	}
}
