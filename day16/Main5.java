import java.util.*;
public class Main5{
    static String reverseStr(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }
    static String reverseStr2(String str){
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length/2;i++){//二進の入れ替え/2は総数を群数繰り返し
            char c=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=c;
        }
        String result=new String(arr);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("文字列>");
        String str=sc.next();
        str=reverseStr2(str);
        System.out.println(str);
    }
}
