import java.util.*;
public class Main4{
	public static void main(String[] args){
		Random rand=new Random();
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=rand.nextInt(6)+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
