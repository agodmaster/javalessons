import java.util.*;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("何日分のデータを入力しますか>");
        int days=sc.nextInt();
        double[] weights=new double[days];
        for(int i=0;i<weights.length;i++){
                System.out.print(i+1+"日目:");
                weights[i]=sc.nextDouble();
        }
        //System.out.println(Arrays.toString(weights));
        System.out.println("体重結果");
        double sum=0.0;
        double min=weights[0];
        for(int i=0;i<weights.length;i++){
            System.out.printf("%d日目[%.1f]%n",i+1,weights[i]);
            sum+=weights[i];
            if(weights[i]<min){
                min=weights[i];
            }
        }
        System.out.printf("平均[%.1f]%n",sum/weights.length);
        System.out.printf("目標[%.1f]%n",min-2.0);
    }
}
