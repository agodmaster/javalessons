import java.util.Scanner;
public class MethodLesson4 {
	//税抜価格(int)と消費税率(int)を受け取り税込み価格(int)を返すメソッド
	static int calcTotalFee(int costExcludeTax ,int tax){
		//消費税8%ならtax8%/100で0.08になりそこに1足して1.08になります
		double totalFee=costExcludeTax*(1+tax/100d);//dはdouble型だよ
		return (int)totalFee;//intに戻して返してます（小数点切り捨て）
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cost=0;
		int price;
		System.out.print("消費税は何％ですか>");
		int tax=scan.nextInt();
		do{
			System.out.print("価格を入力(0でお会計)>");
			price=scan.nextInt();
			cost+=price;
		}while(price !=0);
		int totalFee=calcTotalFee(cost,tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です。",totalFee);
	}
}

