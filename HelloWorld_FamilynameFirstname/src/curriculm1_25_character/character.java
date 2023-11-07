package curriculm1_25_character;
//キャラの共通項目
public class character {
	String name = "1";
	//int HP = 0;
	//int MP = 0;
	//int ATK = 0;
	//int SPE = 0;
	//int DEF = 0;
	private String status_name[] = {"HP","MP","ATK","SPE","DEF"};
	public String[] getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name[]) {
		this.status_name = status_name;
	}
}
