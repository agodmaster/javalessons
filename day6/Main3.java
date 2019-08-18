import java.util.*;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("信号の色を入力してください>");
        String color=sc.next();
        switch(color){
        case "赤":
            System.out.println("赤は止まれ");
            break;
        case "黄":
            System.out.println("黄は注意");
            break;
        case "青":
            System.out.println("青は進め");
            break;
        default:
            System.out.println(color+"はありません!");
        }
    }
}
