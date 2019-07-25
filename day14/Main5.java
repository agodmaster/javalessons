import java.util.*;
public class Main5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    System.out.print("何クラスありますか>");
    int cls=sc.nextInt();
    int[][] data=new int[cls][];
    double[] ave=new double[cls];
    for(int i=0;i<cls;i++){
      System.out.print(i+1+"組は何人ですか>");
	  int student=0;
      student=sc.nextInt();
      data[i]=new int[student];
     }
    for(int i=0;i<cls;i++){
 	   int sum=0;
      for(int j=0;j<data[i].length;j++){
        data[i][j]=rand.nextInt(101);
        sum+=data[i][j];
      }
      ave[i]=(double)sum/data[i].length;
      sum=0;
    }
    System.out.println("result");
    for(int i=0;i<cls;i++){
      System.out.printf("%d組 平均[%.1f]:",i+1,ave[i]);
      for(int j=0;j<data[i].length;j++){
        System.out.printf("%4d",data[i][j]);
      }
      System.out.println();
    }
  }
}
