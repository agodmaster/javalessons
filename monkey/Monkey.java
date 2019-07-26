public class Monkey{
	//フィールド変数
	public String name;
	public int age;
	public Monkey(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void greet(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！\n",this.name,this.age);
	}
	public void takeuma(){
		System.out.printf("%sは上手に竹馬にのった！\n",this.name);
	}
	public void sakadachi(){
		System.out.printf("%sはひょいと逆立ちをした！\n",this.name);
	}

}
