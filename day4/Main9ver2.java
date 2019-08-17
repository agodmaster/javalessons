import java.util.*;
public class Main9ver2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ワンちゃんの名前を入力>");
        String name=sc.nextLine();
        System.out.print(name+"の年齢>");
        int age=sc.nextInt();
        int ageHuman=age*7;
        System.out.printf("%s(%d才)は人間の年齢だと%d才です。",name,age,ageHuman);
    }
}
