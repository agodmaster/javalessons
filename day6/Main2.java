import java.util.*;
public class Main2{
    public static void main(String[] args){
        int x=7;
        int y=3;
        System.out.print("オペレータを選択してください(1:+ 2:-  3:*  4:/  5:%)>");
        Scanner sc=new Scanner(System.in);
        int select=sc.nextInt();
        if(select==1){
            System.out.printf("%d + %d = %d",x,y,x+y);
        }else if(select==2){
            System.out.printf("%d - %d = %d",x,y,x-y);
        }else if(select==3){
            System.out.printf("%d * %d = %d",x,y,x*y);
        }else if(select==4){
            System.out.printf("%d / %d = %d",x,y,x/y);
        }else if(select==5){
            System.out.printf("%d %% %d = %d",x,y,x%y);
        }else{
            System.out.println("不正な選択です");
        }
    }
}
