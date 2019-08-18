import java.util.*;
public class Main7{
    public static void main(String[] args){
        Random rand=new Random();
        int count=0;
        while(true){
            count++;
            int dice1=rand.nextInt(6)+1;
            int dice2=rand.nextInt(6)+1;
            System.out.printf("%d回目(%d,%d)%n",count,dice1,dice2);
            if(dice1 == dice2){
                break;
            }
        }
        System.out.println(count+"回目にぞろ目がでました！");
    }
}
