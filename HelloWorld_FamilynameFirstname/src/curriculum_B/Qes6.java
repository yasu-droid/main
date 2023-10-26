package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 商品の残り台数をランダムで出力　上限は１１
		int[] pieces = new int[6];
		for (int i = 0; i < 6; i++) {
			Random rand = new Random();
			pieces[i] = rand.nextInt(12);
		}

		// コンソールで入力を受け取り
		Scanner scanner = new Scanner(System.in);
		System.out.print("検索する商品名を入力してください: ");
		String searchItem = scanner.next();

		// コンソールに入力した文字を「、」毎に区切り、１文を配列にする
		String[] nums = searchItem.split("、");
		for(String str:nums) {
			//	コンソールに「パソコン」が入っている場合
			switch(str) {
			case "パソコン":
				//「パソコン」の残り台数を表示
				System.out.println(str + "の残り台数は" + pieces[0] + "台です");
				break;
				//	コンソールに「冷蔵庫」が入っている場合
			case "冷蔵庫":
				//「冷蔵庫」の残り台数を表示
				System.out.println(str+"の残り台数は" + pieces[1] + "台です");
				break;
				//	コンソールに「洗濯機」が入っている場合
			case "洗濯機":
				//「洗濯機」の残り台数を表示
				System.out.println(str + "の残り台数は" + pieces[2] + "台です");
				break;
				//	コンソールに「加湿器」が入っている場合
			case "加湿器":
				//「加湿器」の残り台数を表示
				System.out.println(str + "の残り台数は" + pieces[3] + "台です");
				break;

				//	コンソールに「テレビ」、「ディスプレイ」が入っている場合
			case "テレビ","ディスプレイ":
				//「テレビ」が入っている場合は、テレビの残り台数を表示、「ディスプレイ」が入っている場合は、[11-テレビの残り台数]を残り台数として表示
				System.out.println( str.equals("テレビ")?str + "の残り台数は" + pieces[4] + "台です":str + "の残り台数は" + (11 - pieces[4]) + "台です");
			break;
			// 上記以外の商品名が入っている場合
			default:
				// 指定の商品ではないと表示
				System.out.println("『" + str + "』は指定の商品ではありません");

			}
		}

		scanner.close();
	}

}




