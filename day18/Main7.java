import java.util.*;
public class Main7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] medals={"Gold","Silver","Bronze"};
		for(int i=0;i<3;i++){
			String country=sc.next();
			System.out.println(medals[i]+" "+country);
		}
    }
}
