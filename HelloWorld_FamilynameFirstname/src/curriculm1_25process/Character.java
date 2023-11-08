package curriculm1_25process;

//処理用 修正1

public class Character {
    private String name;
    private int hp;

//nameのセッターとゲッター
    public void setName(String character_name) {
        this.name = character_name;
    }
    public String getName() {
        return this.name;
    }

//HPのセッターとゲッター
    public void setHP(int character_hp) {
        this.hp = character_hp;
    }
    public int getHP() {
        return this.hp;
    }
}

