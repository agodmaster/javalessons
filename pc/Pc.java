public class Pc{
	String maker;
	int price;
	static int totalPc;
	Pc(String maker,int price){
		this.maker=maker;
		this.price=price;
		totalPc++;
	}
	void showStatus(){
		System.out.printf("メーカー名:%s,値段:%d%ni",this.maker,this.price);
	}
	static void total(){
		System.out.print(totalPc);
	}
}
