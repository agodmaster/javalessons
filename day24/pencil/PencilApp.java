public class PencilApp{
	public static void main(String[] args){
		Pencil blackPen=new Pencil();
		Pencil redPen=new Pencil("赤");
		Pencil bluePen=new Pencil("青",12);
		blackPen.write();
		blackPen.showStatus();
		for(int i=0;i<11;i++){
			redPen.write();
			redPen.showStatus();
		}
	}
}
