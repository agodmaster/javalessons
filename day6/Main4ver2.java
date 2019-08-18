import java.util.*;
public class Main4ver2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("月を入力>");
        int month=sc.nextInt();
        switch(month){
        case 3:
        case 4:
        case 5:
            System.out.println(month+"月は春です。");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(month+"月は夏です。");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(month+"月は秋です。");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println(month+"月は冬です。");
            break;
        default:
            System.out.println("そんな月はありません");
        }
    }
}
