package curriculm1_23;

public class Profile {
	private String name;
	private double height;
	private int speed;
	
	//セッターを使った
	public void setName(String name) {
		this.name = name;
		System.out.println("動物名:" + name);
	}
	//ゲッターを使った
	public double getHeight(double height) {
		System.out.println("体長:" + height + "m");
		return height;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("速度:" + speed + "km/h");
	}

}