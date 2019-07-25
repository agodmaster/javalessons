public class Main2{
	public static void main(String[] args){
		int x = 100;
		int y = 10;
		int z=add(x,y);//addにx,yの値を与えますよ
		System.out.println(z);
	}
	public static int add(int a,int b){//ここにx,yの値を入れる
		int ans = a + b;
		return ans;//こちらでaddに返す
	}
}
