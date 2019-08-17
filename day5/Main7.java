import java.util.*;
public class Main7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("点数を入力>");
        int score=sc.nextInt();
        if(score < 40){
            System.out.println(score+"点は不可です");
        }else if(score < 60){
            System.out.println(score+"点は可です");
        }else if(score < 80){
            System.out.println(score+"点は良です");
        }else{
            System.out.println(score+"点は優です");
        }
    }
}
