import java.util.*;
public class MethodLesson6{
	static void arrReverse(int[] arr){//二進の入れ替え
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}	
	}
	public static void main(String[] args){
		int[] arr=new int[]{1,2,3,4,5};
		arrReverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
