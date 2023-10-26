package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		問1_3
		String username;
		username = null;
		// Scannerで初期化
		Scanner scanner = new Scanner(System.in);  

		System.out.print("ユーザー名を入力してください:");
		// 文字列の入力の受け取り
		username = scanner.next();  
		// 文字の長さを取得
		int wordnum = username.length();

		// 10文字以上なら
		if(wordnum >= 10 ){
			System.out.println("名前を10文字以内にしてください");
			// 10文字以内かつ0字以下なら
		}else if(wordnum <= 0) {
			System.out.println("名前を入力してください");
			// 英数字での入力のみ受付
		}else if( username.matches("^[A-Za-z0-9]+$")) {
			// 入力した文字の表示
			System.out.println("ユーザー名「" +username+ "」を登録しました\r\n");
			// じゃんけんを繰り返した数のを入れる変数
			int times = 0;
			boolean flag = false;

			//flagがtrueになるまで処理を繰り返す
			while(!flag) { 

				// 手の入力を受け取る変数
				int myhand;
				myhand = 0;
				System.out.print("自分の手を入力してください:");
				// 手のコンソール入力での受け取り
				myhand = scanner.nextInt(); 

				// 相手の手をランダムに出力
				Random enerand = new Random();
				int enenum = enerand.nextInt(3);

				// じゃんけんの定義
				String[] hand = new String[3];
				hand[0] = "グー";
				hand[1] = "チョキ";
				hand[2] = "パー";

				// じゃんけんで勝つ場合
				if((myhand==0 && enenum==1)||(myhand==1 && enenum==2)||(myhand==2 && enenum==0)) 
				{
					System.out.println(username + "の手は" + hand[myhand]);
					System.out.println("相手の手は"+hand[enenum]);
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					//whileの繰り返し処理を終了させる
					flag = true;

					// 自分がチョキ、相手グーの場合
				}else if(myhand==1 && enenum==0) {
					System.out.println(username+"の手は"+hand[myhand]);
					System.out.println("相手の手は"+hand[enenum]);
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！\r\n");
					// 自分がパー、相手がチョキの場合
				}else if(myhand==2 && enenum==1) {
					System.out.println(username+"の手は"+hand[myhand]);
					System.out.println("相手の手は"+hand[enenum]);
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ\r\n");
					// 自分がグー、相手がパーの場合
				}else if(myhand==0 && enenum==2) {
					System.out.println(username+"の手は"+hand[myhand]);
					System.out.println("相手の手は"+hand[enenum]);
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです\r\n");
					// あいこの場合
				}else {
					System.out.println(username+"の手は"+hand[myhand]);
					System.out.println("相手の手は"+hand[enenum]);
					System.out.println("DRAW あいこ もう一回しましょう！\r\n");
				}
				// 繰り返した回数のカウント
				times++;
			}
			System.out.println("勝つまでにかかった回数は"+times+"です");

			//入力した文字に英数字以外がある場合
		}else {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		scanner.close();
	}

}
