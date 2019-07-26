public class PcApp{
	public static void main(String[] args){
		Pc pc=new Pc("TOSHIBA",30000);
		Pc pc2=new Pc("FUJITSU",50000);
		pc.showStatus();
		pc.price=32000;
		pc2.maker="SHORP";
		Pc.total();
	}
}
