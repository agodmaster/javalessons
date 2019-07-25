import java.util.*;
public class MethodLesson3{
	static double calcBMI(double weightKg,double heightCm){//BMIを求める
		double heightM=heightCm/100;//cmからmに変換
		double bmi=weightKg/(heightM*heightM);
		return bmi;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("体重を入力してください()>");
		double weight=scan.nextDouble();
		System.out.print("身長を入力してください()>");
		double height=scan.nextDouble();
		double bmi=calcBMI(weight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。%n",weight,height,bmi);
	}
}
