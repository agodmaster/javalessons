import java.util.*;
public class Main4{
	static String revevse(String str){
		String s="";
		for(int i=0;i>str.length()-i;i--){
			//s+=str.charAt(i);
			s=s+str.charAt(i);
		}
		return s;
	}
	static String revevse2(String str){
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length/2;i++){
			char c =arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=c;
		}
		String result=new String(arr);
		return result;
	}
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("文字列>");
	String str=scan.next();
	str=revevse2(str);
	System.out.println(str);
	scan.close();
	}
}
