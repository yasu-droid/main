package curriculm1_29;

class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	int sum_people;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(	String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}
	//heightとweoghtを使ってBMIの計算
	public double bmi(){
		return bmi = weight / (height * height);
	}
	//合計人数を表示するメソッド
	public int sum_people() {
		//合計人数に1を返す
		return sum_people = 1;
	}
	
	public void print() {
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "才です");
		//BMIは小数点以下を切り捨てして表示
		System.out.println("BMIは" +Math.floor(bmi) + "です\r\n");
		System.out.println("合計" + sum_people + "人です");

	}

}
