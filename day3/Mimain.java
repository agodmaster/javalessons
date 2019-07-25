public class Mimain{
    public static void main(String[] args){
        char c1='苗';
        char c2='字';
        char c3='名';
        char c4='前';
        int sum=c1+c2+c3+c4;
        int ave=sum/4;
        System.out.println("ポイントは"+sum+"平均は"+ave);
        System.out.println("苗:"+(int)c1);
        System.out.println("字:"+(int)c2);
        System.out.println("名:"+(int)c3);
        System.out.println("前:"+(int)c4);
        int max=Math.max(Math.max(c1,c2),Math.max(c3,c4));
        System.out.println("最強文字は:"+max+"powerです");

    }
}
