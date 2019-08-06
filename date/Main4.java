import java.text.SimpleDateFormat;
import java.util.Date;
public class Main4{
	public static void main(String[] args) throws Exception{
		Date now=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s=f.format(now);
		System.out.println(s);
		Date d=f.parse("2011/09/22 01:23:45");
		System.out.println(d);
	}
}
