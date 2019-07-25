import java.util.*;//メインテーマはメソットの復習
public class Main8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("計算マシーンを使いますか?(y or n)>");
            String retry=sc.next().toLowerCase();
            if(!retry.equals("y")){
                break;
            }
            System.out.print("数字を3つ入力してください>");
            int ans=sumOf(sc.nextInt(),sc.nextInt(),sc.nextInt());//nextIntは１つずつsumOfでもらう
            System.out.println("合計は"+ans+"です。");
            
        }
        System.out.println("アプリケーションを終了します");
    }
    public static int sumOf(int a,int b,int c){
        return a+b+c;
    }
}
