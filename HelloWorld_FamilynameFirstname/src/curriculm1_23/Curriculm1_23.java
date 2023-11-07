package curriculm1_23;

class Animal {
	private String name;	// 動物名
	private double height;	//身長
	private int speed;	// 速度

	// 動物名を格納するメソッド
	public void setName(String Animal_name) {
		this.name = Animal_name;
	}

	// 動物名を取得するメソッド
	public String getName() {
		return this.name;
	}

	// 体長を格納するメソッド
	public void setHeight(double animal_height) {
		this.height = animal_height;
	}

	// 体長を取得するメソッド
	public double getHeight() {
		return this.height;
	}

	// 速度を格納するメソッド
	public void setSpeed(int animal_speed) {
		this.speed = animal_speed;
	}

	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}
}

public class Curriculm1_23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal animal = new Animal();

		// 動物の名前と体長と金額を格納 
		animal.setName("ライオン");
		animal.setHeight(2.1);
		animal.setSpeed(80);

		// 動物の名前と体長と速度を取得
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getHeight() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

}