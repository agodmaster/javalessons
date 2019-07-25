import java.util.*;
public class Q3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("底辺:");
        double bottom=sc.nextDouble();
        System.out.print("高さ;");
        double height=sc.nextDouble();
        double area=calc(bottom,height);
        System.out.printf("底辺:%.1f,高さ:%.1fの三角形の面積は%.1fです",
bottom,height,area);
		System.out.println();

    }
    public static double calc(double bottom,double height){
        return bottom*height/2;
    }
}
