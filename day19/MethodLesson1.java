public class MethodLesson1{
	static int sumOf(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args){
		int sum = sumOf(3,5);//sumにsumOfで指令した後に帰ってきた値を入れる
		System.out.println(sum);//帰ってきた値を出力
		System.out.println(sumOf(10,20));//別の指令を送る
	}
}
