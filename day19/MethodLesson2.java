public class MethodLesson2{
	static int largeOf(int a, int b){//どっちが大きいか等しいか
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}
	static double rectArea(double height,double width){//高さ＊幅を求める
		return height*width;
	}
	static boolean isEven(int n){//偶数か奇数を求める
		return n%2==0;
	}
	public static void main(String[] args){
		System.out.println(largeOf(10,20));
		System.out.println(rectArea(10.0,15.0));
		int x=10;
		//if(isEven(x)==true){ でも同じ意味
		if(isEven(x)){
			System.out.println(x+"は偶数");
		}else{
			System.out.println(x+"は奇数");
		}
	}
}
