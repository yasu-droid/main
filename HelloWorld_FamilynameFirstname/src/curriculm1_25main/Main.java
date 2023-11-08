package curriculm1_25main;

import java.util.Random;
import java.util.Scanner;

import curriculm1_25process.Character;
import curriculm1_25process.Player;

public class Main {

	public static void main(String[] args) {

		Character chara = new Character();
		Player player = new Player();
		

		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();

		Random hp = new Random();
		Random mp = new Random();
		Random atk = new Random();
		Random spe = new Random();
		Random def = new Random();
		int hpValue = hp.nextInt(999) + 1;
		int mpValue = mp.nextInt(999) + 1;
		int atkValue = atk.nextInt(999) + 1;
		int speValue = spe.nextInt(999) + 1;
		int defValue = def.nextInt(999) + 1;


		// 名前を格納と入力文字を出力
		chara.setName(name);
		System.out.println("こんにちは「" + chara.getName() + "」さん");

		System.out.println("ステータス");

		// hpにランダムな数字を格納と出力
		chara.setHP(hpValue); // 例として乱数を生成
		System.out.println("HP：" + chara.getHP());

		// mpにランダムな数字を格納と出力
		player.setMP(mpValue); // 例として乱数を生成
		System.out.println("MP：" + player.getMP());

		// atkにランダムな数字を格納と出力
		player.setATK(atkValue); // 例として乱数を生成
		System.out.println("攻撃力：" + player.getATK());

		//speにランダムな数字を格納と出力
		player.setSPE(speValue); // 例として乱数を生成
		System.out.println("素早さ：" + player.getSPE());

		// defにランダムな数字を格納と出力
		player.setDEF(defValue); // 例として乱数を生成
		System.out.println("防御力：" + player.getDEF());

		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");

	}
}