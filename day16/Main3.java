public class Main3{
	public static void main(String[] args){
		System.out.println(add(add(10,20),add(30,40)));//add()毎にreturn
	}
	public static int add(int a,int b){//ここに10,20と30,40の値を入れる
		int ans = a + b;
		return ans;//こちらでaddに返す
	}
}
