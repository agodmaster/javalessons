import java.util.*;
public class Main3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("何行?>");
		int line=sc.nextInt();
		System.out.print("何列?>");
		int column=sc.nextInt();
		int[][] twoarray=new int[line][column];
		for(int i=0;i<line;i++){
			for(int j=0;j<column;j++){
				twoarray[i][j]=rand.nextInt(100);
			}			
		}
		for(int[] arr:twoarray){
			for(int n:arr){
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
	}
}
