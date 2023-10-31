package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String Animal_name;
	// Q2：フィールドに動物の数の変数を定義してください。
	int Animal_num;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog(){
		this.Animal_name = "犬" ;
	}
	public String toString() {
		return Animal_name;
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int Animal_num) {
		this.Animal_num = Animal_num;
	}


}
