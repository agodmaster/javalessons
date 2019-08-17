public class Main{
    public static void main(String[] args){ 
    char name='苗';
    char name1='字';
    char name2='名';
    char name3='前';
    int name4=name+name1+name2+name3;
    int ave=name4/4;
    System.out.println("ポイントは"+name4+"平均は"+ave); 
    System.out.println("苗"+(int)name);
    System.out.println("字"+(int)name1);
    System.out.println("名"+(int)name2);
    System.out.println("前"+(int)name3);
    int max=Math.max(Math.max(name,name1),Math.max(name2,name3));
    System.out.println("最強文字は:"+max+"powerです");
}
}
