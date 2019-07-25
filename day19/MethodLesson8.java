import java.util.*;
public class MethodLesson8{
	static int[] mekeArrFirstToLast(int first,int last){
							//+1は要素に1増やしてすべての数値が読めるようにする
		int[] retArr=new int[Math.abs(first-last)+1];//absは絶対値を求めます
			for(int i=0;i<retArr.length;i++){//ここで4から-2までの並びを作る
				/*
				retArr[i]=first;
				if(first>last){
					first--;
				}else{
					first++;
				}
				でもできる
				*/
				retArr[i]=first<last ? first++:first--;
			}
		return retArr;
	}
	public static void main(String[] args){
		int[] arr=mekeArrFirstToLast(4,-2);//実際4--2なので足し算になり要素数6
		System.out.println(Arrays.toString(arr));
	}
}
