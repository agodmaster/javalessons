public class Main{
	public static void main(String[] args){
		int[][] data={{5,6,7,8},{1,3,5,7},{2,4,6,8},{10,11,12,13,14}};
			System.out.println("{");
			for(int i=0;i<data.length;i++){
				System.out.print("{");
				for(int j=0;j<data[i].length;j++){
					System.out.print(data[i][j]+",");
				}
				System.out.println("},");
			}
			System.out.println("}");
	}
}
