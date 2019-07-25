public class Apple{
	int price;
	Apple(){}//コンストラクタを書かなかった場合引数なしのコンストラクタが暗黙で作られる
	void showStatus(){
		System.out.println(this.price);
	}
}
