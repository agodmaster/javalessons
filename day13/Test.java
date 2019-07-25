import java.util.Random;
public class Test {
    public static void main(String[] args) {
        final int MAX_TURN=2;
        final String[] PLAYERS={"Mother","Kids"};
        final int[] balls={1,2,3,4,5,6,7,8,9,10};
        int[] sums=new int[PLAYERS.length];
        Random rand=new Random();
        for(int i=0;i<MAX_TURN;i++){
            for(int j=0;j<PLAYERS.length;j++){
                int removedBallCount=i*PLAYERS.length+j;
                System.out.println(PLAYERS[j]);
                int index=rand.nextInt(balls.length-removedBallCount);
                System.out.println(balls[index]);
                sums[j]+=balls[index];
                int temp=balls[index];
                balls[index]=balls[balls.length-1-removedBallCount];
                balls[balls.length-1-removedBallCount]=temp;
            }
        }
        System.out.println("\nResult");
        for(int i=0;i<PLAYERS.length;i++){
            System.out.printf("%s %d%n",PLAYERS[i],sums[i]);
        }
        System.out.println();
        if(sums[0]>sums[1]){
            System.out.println(PLAYERS[0]+" Win!");
        }else if(sums[0]<sums[1]){
            System.out.println(PLAYERS[1]+" Win!");
        }else{
            System.out.println("Draw");
        }
    }
}
