import java.util.*;
public class Main12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を3つ入力>");
		final int[] arr=new int[3];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] result=doubleArr(arr);
		System.out.println(Arrays.toString(result));
	}
	public static int[] doubleArr(int[] arr){
		int[] retArray=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			retArray[i]=arr[i]*2;
		}
		return retArray;
	}
}
