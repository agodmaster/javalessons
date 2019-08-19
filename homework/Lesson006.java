import java.util.*;
public class Lesson006{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("先頭の整数を入力＞");
		int lead=sc.nextInt();
		System.out.print("末尾の整数を入力＞");
		int end=sc.nextInt();
		while(true){
            System.out.print(end+" ");
            if(end>lead){
                end--;
            }else if(end<lead){
                end++;
            }else{
                break;
            }
        }
		System.out.println();
	}
}
