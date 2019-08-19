import java.util.*;
public class Lesson008{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("先頭の整数を入力＞");
		int lead=sc.nextInt();
		System.out.print("末尾の整数を入力＞");
		int end=sc.nextInt();
		int total=lead+end;
		if(lead %2 == 0 || end % 2 == 0){
			if(total %2 == 0){
				while(true){
					if(lead<=end){
						System.out.println(lead+"から"+end+"の偶数は、");
						while(lead<=end){
							System.out.print(lead+" ");
							lead+=2;
						}
						System.out.println("です");
						break;
					}else if(end<=lead){
						System.out.println(end+"から"+lead+"の偶数は、");
						while(end<=lead){
							System.out.print(end+" ");
							end+=2;
						}
						System.out.println("です");
						break;
					}
				}
			}else{
				System.out.println("片方も偶数で入力してね");
			}
		}else{
			System.out.println("どちらも偶数で入力してね");
		}
	}
}
