import java.util.*;
public class Main6ver2{
    public static void main(String[] args){
        Random rand=new Random();
        int count=0;
        while(true){
            count++;
            int num=rand.nextInt(999)+1;
            System.out.printf("%d:%d%n",count,num);
            if(num == 777){
                break;
            }
        }
        System.out.println(count+"回目に777がでました！");
    }
}
