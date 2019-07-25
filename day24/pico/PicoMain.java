import java.util.*;
public class PicoMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Pico pico=new Pico();
        for(int i=0;i<4;i++){
            System.out.printf("%s手に何を持ちますか>",i==3 || i==0 ? "右":"左");
            pico.haveObject(sc.next());
		}
	}
}
