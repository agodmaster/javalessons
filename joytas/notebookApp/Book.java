public class Book{
	private int page;
	private int price;
	public Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void pagePrice(){
		System.out.printf("ページ数：%d%n価格：%d%n",this.page,this.price);
	}
}
