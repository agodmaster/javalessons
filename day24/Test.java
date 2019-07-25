import my.util.*;
import java.util.*;
public class Test{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		Common.reverse(arr);
		System.out.println(Arrays.toString(arr));
		Common.shuffle(arr);
		System.out.println(Arrays.toString(arr));
		Common.sort(arr);
		System.out.println(Arrays.toString(arr));
		Common.sort(arr,true);
		System.out.println(Arrays.toString(arr));
		Common.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
