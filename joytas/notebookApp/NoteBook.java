public class NoteBook extends Book{
	private String content="";
	public NoteBook(int page,int price){
		super(page, price);
	}
	public void append(String str){
		content +=str;
	}
	@Override
	public void pagePrice(){
		super.pagePrice();
		System.out.printf("内容：%s%n",this.content);
	}
}
