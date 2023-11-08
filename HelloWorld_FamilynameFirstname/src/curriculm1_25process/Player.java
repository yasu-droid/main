package curriculm1_25process;

public class Player extends Character {
    private int mp;
    private int atk;
    private int spe;
    private int def;

//MPのセッターとゲッター
    public void setMP(int character_mp) {
        this.mp = character_mp;
    }
    public int getMP() {
        return this.mp;
    }

//atkのセッターとゲッター
    public void setATK(int character_atk) {
        this.atk = character_atk;
    }
    public int getATK() {
        return this.atk;
    }

//speのセッターとゲッター
    public void setSPE(int character_spe) {
        this.spe = character_spe;
    }
    public int getSPE() {
        return this.spe;
    }

//defのセッターとゲッター
    public void setDEF(int character_def) {
        this.def = character_def;
    }
    public int getDEF() {
        return this.def;
    }
}