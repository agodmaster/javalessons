import java.util.*;
public class Main10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final double PI=3.14;
        System.out.print("半径>");
        double r=sc.nextDouble();
        System.out.printf("半径%.2fの円の円周の長さは%.2f。面積は%.2fです。",r,2*PI*r,PI*r*r);
    }
}
