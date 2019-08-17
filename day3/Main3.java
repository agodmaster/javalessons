public class Main3{
    public static void main(String[] args){
        final double TAX=1.08;
        TAX=1.1;//final定数を再代入しようとするとコンパイルエラー
        System.out.println("税金は"+TAX+"です");
    }
}
