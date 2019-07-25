//importは不要実行時にユニックスで入力するため
public class MainQ{
	public static void main(String[] args){
		String str1=args[0];
		String str2=args[1];
		System.out.print(str1+"と"+str2+"では");
		if(str1.length()>str2.length()){
			System.out.println(str1+"の方が文字数が多いです");
		}else if(str1.lenght()>str2.length()){
			System.out.println(str2+"の方が文字数が多いです");
		}else{
			System.out.println("文字数は同じです");
		}
	}
}
