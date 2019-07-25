public class Main{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<args.length;i++){
			//文字列をint型にする
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("引数の合計は"+sum+"です");
	}
}
