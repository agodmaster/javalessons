import java.util.*;
public class MethodLesson9{
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10);
							//if文を省略した判定(num %2 ==0){偶数}eles{奇数}
		System.out.printf("%dは%sです", num, num % 2 == 0 ? "偶数" : "奇数");
						//ただし３つ以上の判定だと見づらいのでif文を使うこと
	}
}
