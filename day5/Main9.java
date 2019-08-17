import java.util.*;
public class Main9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("色を入力>");
        String color=sc.nextLine();
        if(color.equals("赤") || color.equals("緑") || color.equals("青")){
            System.out.println(color+"は光の三原色です。");
        }else{
            System.out.println(color+"は光の三原色ではありません。");
        }
    }
}
