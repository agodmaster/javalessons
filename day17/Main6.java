public class Main6{
	public static void main(String[] args){
		int[] arr={1,2,3};
		hoge(arr);
		System.out.println(arr[0]);
	}
	public static void hoge(int[] arr){
		arr[0]=100;
	}
}
