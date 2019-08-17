import java.util.*;
public class Main10{
    public static void main(String[] args){
        Random rand=new Random();
        int num=rand.nextInt(100)+1;
        System.out.printf("乱数を一つ生成しました(%d)%n",num);
        if(30<=num && num<=70){
            System.out.println(num+"は30以上70以下です");
        }else{
            System.out.println(num+"は30以上70以下ではありません");
        }
	}
}
