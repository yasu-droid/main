package curriculm1_23;

public class Profile {
	private String name;
	private double height;
	private int speed;

	//ゲッターの使用
	public String getName(String name) {
		System.out.println("名前:" + name);
		return name;
	}

	//セッターを使った
	public void setHeight(double height) {
		// heightがマイナスなら
		if(height <= 0) {
			// 0として出力
			System.out.println("マイナスは設定できません。０を設定します");
			System.out.println("体長:" + 0 + "m");
		// それ以外なら
		}else {
			// heightに入力された数値を出力
			this.height = height;
			System.out.println("体長:" + height + "m");
		}
	}

	//セッターを使った
	public void setSpeed(int speed) {
		// speedがマイナスなら
		if(speed <= 0){
			// 0として出力
			System.out.println("マイナスは設定できません。０を設定します");
			System.out.println("速度:" + 0 + "km/h");
		// それ以外なら
		}else {
			this.speed = speed;
			// speedに入力された数値を出力
			System.out.println("速度:" + speed + "km/h");	
		}
	}

}