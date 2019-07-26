public class CopyMachine{
	int paper;
	CopyMachine(int sheet){
		this.paper=sheet > 0 ? sheet : 0;
		/*
		if(sheet > 0){
			this.paper=sheet;
		}else{
			this.paper=0;
		}
		*/
	}
	void feedPaper(int sheet){
		this.paper+=sheet;
		System.out.printf("%d枚補給しました。%n",sheet);
	}
	void copy(int sheet){
		int num=this.paper > sheet ? sheet : this.paper;
		this.paper-=num;
		System.out.printf("%d枚コピーしました。%n",num);
	}
	void display(){
		System.out.printf("コピー可能な枚数は%d枚です。%n",this.paper);
	}
}
