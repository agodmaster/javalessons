import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double[] weight=new double[3];
		double sum=0.0;
		System.out.print("1日目>");
		weight[0]=sc.nextDouble();
		System.out.print("２日目＞");
		weight[1]=sc.nextDouble();
		System.out.print("3日目>");
		weight[2]=sc.nextDouble();
		for(int i=0;i<weight.length;i++){
			sum+=weight[i];
		}
		System.out.println();
		for(int i=0;i<weight.length;i++){
			System.out.printf("%d日目;%.1fkg%n",i+1,weight[i]);
		}
		System.out.printf("合計:%.1fkg%n",sum);
		System.out.printf("平均:%.1fkg%n",sum/weight.length);
	}
}
