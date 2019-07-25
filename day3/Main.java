public class Main{
    public static void main(String[] args){ 
    char name='小';
    char name1='林';
    char name2='拓';
    char name3='也';
    int name4=name+name1+name2+name3;
    int ave=name4/4;
    System.out.println("ポイントは"+name4+"平均は"+ave); 
    System.out.println("小"+(int)name);
    System.out.println("林"+(int)name1);
    System.out.println("拓"+(int)name2);
    System.out.println("也"+(int)name3);
    int max=Math.max(Math.max(name,name1),Math.max(name2,name3));
    System.out.println("最強文字は:"+max+"powerです");
}
}
