public class Bank{
	String accountNumber;//講座番号
	int balance;//残額
	/* ① 文字列表現のメソッド*/
	@Override
	public String toString(){
		return "¥" +this. balance+"(口座番号="+this.accountNumber+")";
	}
	@Override
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Bank){
			Bank b=(Bank)o;
			if(this.accountNumber.trim().equals(b.accountNumber.trim())){
				return true;//trum()は前後の空白を取ると言う意味
			}
		} 
		return false;
	}
}
