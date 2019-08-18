import java.util.*;
public class Main4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("月を入力>");
        int month=sc.nextInt();
        if(month>=3 && month <=5){
            System.out.println(month+"月は春です");
        }else if(month >=6 && month<=8){
            System.out.println(month+"月は夏です");
        }else if(month >=9 && month<=11){
            System.out.println(month+"月は秋です");
        }else if(month ==12 || month==1 || month==2){
            System.out.println(month+"月は冬です");
        }else{
            System.out.println("そんな月はありません。");
        }
    }
}
