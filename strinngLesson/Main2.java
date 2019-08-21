import my.util.*;
public class Main2{
	public static void main(String[] args){
		String num=Common.inputStr("数字をカンマ区切りで入れてね>");//文字列のsc
		String[] data=num.split(",");//文字列のscをdata配列にsplitでカンマ区切りで入れる
		//例入力3,2,4,13なら{"3","2","4","13"}のような文字列配列ができる
		/*
		以下のようにまとめることも出来る
		String[] data=Common.inputStr("ggggg").split(",");
		*/
		int sum=0;
		for(int i=0;i<data.length;i++){
			sum+=Integer.parseInt(data[i]);//Integer.parseIntで文字列の数値を整数に変える
			//sumに一個ずつ取り出した整数に変換したdataを足していく
		}
		Common.print("和は"+sum);
	}
}
