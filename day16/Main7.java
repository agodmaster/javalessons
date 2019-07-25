import java.util.*;
public class Main7{
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
		if(line.charAt(1)==line.charAt(2)&&line.charAt(2)==line.charAt(3)){
			System.out.println("Yes");
		}else{
        System.out.println("No");
		}
    }
}
