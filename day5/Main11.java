import java.util.*;
public class Main11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("性別（男:0,女:1)>");
        int genderNum=sc.nextInt();
        String gender;
        if(genderNum==0){
            gender="男";
        }else{
            gender="女";
        }
        System.out.print("年齢>");
        int age=sc.nextInt();
        if(genderNum==0 && age>=18 || genderNum==1 && age >=16){
            System.out.printf("%s(%d)は結婚できます。%n",gender,age);
        }else{
            System.out.printf("%s(%d)は結婚できません。%n",gender,age);
        }
    }
}
