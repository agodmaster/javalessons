import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("何人>");
        int persons=sc.nextInt();
        System.out.print("何科目>");
        int subjects=sc.nextInt();
        int[][] data=new int[persons][subjects];

        for(int i=0;i<data[][].length;i++):
            for(int j=0;j<data[i].length;j++){
                System.out.print(i+1+"人目の"+(j+1)+"科目目の点数>");
                data[i][j]=sc.nextInt();
            }
        }
        //出力
        for(int i=0;i<data.length;i++){
            System.out.print(i+1+"人目:");
            for(int j=0;j<data[i].length;j++){
                System.out.printf("%4d",data[i][j]);
            }
            System.out.println();
        }
        
    }
}
