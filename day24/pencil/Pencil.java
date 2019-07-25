public class Pencil{
	String color="黒";
	int length;
	Pencil(){
		this.length=10;
	}
	Pencil(String color){
	//	this();
		this.color=color;//メソッド名と同じならthisは必ずつける
	}
	/*
	またはこちらでも可
	Pencil(String c){
		this();
		this.color=c;
	}
	下記はNG
	Pencil(string c){
		this.color=c;
		this();
	}
	*/

	Pencil(String color,int length){
		this.color=color;
		this.length=length;
	}
	void write(){
		if(this.length<=0){
			System.out.println("もう書けません！");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.length--;
	}
	void showStatus(){
		System.out.printf("色:%s,長さ:%d%n",this.color,this.length);
	}
}
