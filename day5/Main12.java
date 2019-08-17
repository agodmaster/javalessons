import java.util.*;
public class Main12{
    public static void main(String[] args){
        Random rand=new Random();
        int num=rand.nextInt(100);
        if(num==0){
            System.out.println("URが出ました!!");
        }else if(num<6){
            System.out.println("SRが出ました!");
        }else if(num<40){
            System.out.println("Rが出ました");
        }else{
            System.out.println("Nが出ました");
        }
    }
}
