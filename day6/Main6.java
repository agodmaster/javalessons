import java.util.*;
public class Main6{
    public static void main(String[] args){
        Random rand=new Random();
        int num=-1;
        int count=0;
        while(num !=777){
            count++;
            num=rand.nextInt(999)+1;
            System.out.printf("%d:%d%n",count,num);
        }
        System.out.println(count+"回目に777がでました！");
    }
}
