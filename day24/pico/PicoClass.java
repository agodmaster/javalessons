public class PicoClass{
    String[] obj=new String[4];
    int count=0;
    void haveObject(String name)throws Exception{
        Thread.sleep(500);
        System.out.println("I have a "+name+".");
        obj[this.count]=name;
        if(count==1 || count==3){
            Thread.sleep(1500);
            System.out.println("...");
            Thread.sleep(800);
            System.out.println("Ah!");
            Thread.sleep(1200);
            if(count==1){
                System.out.println(obj[1]+obj[0]+"!");
            }else{
                System.out.println(obj[3]+obj[2]+"!"); 
                Thread.sleep(2000);
                System.out.println(obj[1]+obj[0]+"~");
                Thread.sleep(2000);
                System.out.println(obj[3]+obj[2]+"~");
                Thread.sleep(2000);
                System.out.println("...");
                Thread.sleep(800);
                System.out.println("Ah!");
                Thread.sleep(1200);
                System.out.println(obj[2]+obj[3]+obj[1]+obj[0]);
            }
        
        }
        this.count++;
    }
}
