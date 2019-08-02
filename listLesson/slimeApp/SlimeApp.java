public class SlimeApp{
	public static void main(String[] args){
		Slime surarin=new Slime();
		surarin.setName("スラリン");
		Slime surakiti=new Slime();
		surakiti.setName("スラキチ");
		surarin.appear();
		surakiti.appear();
		Slime surachi=new Slime("スラッチ");
		surachi.appear();
		System.out.println(Slime.getTotalCount()+"引きのスライム軍団が遅いかかってきた!");
		Slime[] slimes=new Slime[Slime.getTotalCount()];
		slimes[0]=surarin;
		slimes[1]=surakiti;
		slimes[2]=surachi;
		for(Slime s:slimes){
			s.attack();
		}
	}
}
