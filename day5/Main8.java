import java.util.*;
public class Main8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("英語で9月は何(全部小文字でいれよ)>");
        String ans=sc.nextLine();
        if(ans.equals("september")){//equalsは文字列の比較
            System.out.println("正解");
        }else{
            System.out.println("残念");
        }
    }
}
