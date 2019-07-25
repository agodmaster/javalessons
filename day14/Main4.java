import java.util.*;
public class Main4{
    public static void main(String[] args){
        Random rand=new Random();
        int[][] data=new int[2][];//乱数を入れる箱を用意
		data[0] =new int[3];//配列の列が途中１増えるので別々に用意
		data[1] =new int[4];
		int[][] sum=new int [2][];//合計を入れる箱を用意
		sum[0] =new int[3];//入れる方の箱も数を合わせる
		sum[1] =new int[4];
        for(int i=0;i<data.length;i++){//data1の乱数を箱に振り分ける
            for(int j=0;j<data[i].length;j++){
                data[i][j]=rand.nextInt(100);
				sum[i][j]+=data[i][j];//ここで振り分けた乱数を保管します
            }
        }
        System.out.println("****data1****");
        for(int[] arr:data){//data1に入れた乱数を出力する
            for(int n:arr){
                System.out.printf("%4d",n);//4桁の整数にします
            }
        	System.out.println();
		}
        for(int i=0;i<data.length;i++){//data2に使う為に乱数をシャッフルし上書きします
            for(int j=0;j<data[i].length;j++){
                data[i][j]=rand.nextInt(100);
				sum[i][j]+=data[i][j];//上書きした乱数を保持した乱数に足します
			}
        }
        System.out.println("****data2****");
        for(int[] arr:data){//data2に入れた新しい乱数を出力します
            for(int n:arr){
                System.out.printf("%4d",n);
            }
            System.out.println();
		}
        System.out.print("****結果****");
		System.out.println();
        for(int[] arr:sum){//data1とdata2でまとめた合計を出力します
            for(int n:arr){
                System.out.printf("%4d",n);
            }
            System.out.println();
		}
    }
}
