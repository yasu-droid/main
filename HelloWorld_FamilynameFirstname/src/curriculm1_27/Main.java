package curriculm1_27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// コンソールで入力を受け取り
		Scanner scanner = new Scanner(System.in);
		System.out.print("検索する商品名を入力してください: \r\n(例 動物名:体長(m):速度（km/h）) \r\n");
		String animal = scanner.next();		

		// コンソールに入力した文字を「,」毎に区切り、１文を配列にする
		String[] animal_firstsplit = animal.split(",");
		//	「,」ごとに区切られた配列すべてに
		for(int i = 0; i < animal_firstsplit.length ;i++ ) {
			//	さらに「：」ごとに区切って１つの配列にする
			String[] animal_secondsplit = animal_firstsplit[i].split(":");

			//１つの配列内の要素数が3つのみかの判定　2つ以下もしくは4以上状態だと、ただしく,と:を入力してくださいと警告
			if(animal_secondsplit.length != 3 ) {
				System.err.println("正しく入力してください　例 動物名:体長(m):速度（km/h）");	

				//１つの配列内の要素が３つであれば、配列内に該当の情報がそろっているか確認
			}else {
				//	ライオン:2.1:80と入力されていれば
				if(Arrays.asList(animal_secondsplit).contains("ライオン") && Arrays.asList(animal_secondsplit).contains("2.1")&& Arrays.asList(animal_secondsplit).contains("80")) {
					System.out.println("動物名:ライオン");
					System.out.println("体長:2.1m");
					System.out.println("速度:80km/h");
					System.out.println("学名:パンテラ レオ");
					//　ゾウ:3.2:40と入力されていれば
				}else if(Arrays.asList(animal_secondsplit).contains("ゾウ") && Arrays.asList(animal_secondsplit).contains("3.2")&& Arrays.asList(animal_secondsplit).contains("40")){
					System.out.println("");
					System.out.println("動物名:ゾウ");
					System.out.println("体長:3.2m");
					System.out.println("速度:40km/h");
					System.out.println("学名:ロキソドンタ・サイクロティス");
					//　パンダ:1.9:30と入力されていれば
				}else if(Arrays.asList(animal_secondsplit).contains("パンダ") && Arrays.asList(animal_secondsplit).contains("1.9")&& Arrays.asList(animal_secondsplit).contains("30")){
					System.out.println("");
					System.out.println("動物名:パンダ");
					System.out.println("体長:1.9m");
					System.out.println("速度:30km/h");
					System.out.println("学名:アイルロポダ・メラノレウカ");
					//　チンパンジー:30:0.94:25と入力されていれば
				}else if(Arrays.asList(animal_secondsplit).contains("チンパンジー") && Arrays.asList(animal_secondsplit).contains("0.94")&& Arrays.asList(animal_secondsplit).contains("25")){
					System.out.println("");
					System.out.println("動物名:チンパンジー");
					System.out.println("体長:0.94m");
					System.out.println("速度:25km/h");
					System.out.println("学名:パン・トゥログロディテス");
					//　シマウマ:2.4:65と入力されていれば
				}else if(Arrays.asList(animal_secondsplit).contains("シマウマ") && Arrays.asList(animal_secondsplit).contains("2.4")&& Arrays.asList(animal_secondsplit).contains("65")){
					System.out.println("");
					System.out.println("動物名:シマウマ");
					System.out.println("体長:2.4m");
					System.out.println("速度:65km/h");
					System.out.println("学名:チャップマンシマウマ");
					//　インコ:30.1:50と入力されていれば
				}else if(Arrays.asList(animal_secondsplit).contains("インコ") && Arrays.asList(animal_secondsplit).contains("0.1")&& Arrays.asList(animal_secondsplit).contains("50")){
					System.out.println("");
					System.out.println("動物名:インコ");
					System.out.println("体長:0.1m");
					System.out.println("速度:50km/h");
					System.out.println("学名:不明");
				}else {
					//	該当の情報がない、もしくは１つ以上該当していないものが含まれている場合
					System.out.println("入力した動物の情報が見つかりませんでした");
				}
				
//				別回答
//				switch(animal_secondsplit[0]) {
//				case "ライオン":
//					System.out.println("動物名:ライオン");
//					System.out.println("体長:"+animal_secondsplit[1] +"m");
//					System.out.println("速度:"+animal_secondsplit[2] +"km/h");
//					System.out.println("学名:パンテラ レオ");
//					break;
//				default:
//					// どの条件にもマッチしない場合の処理
//					throw new RuntimeException("エラーが発生しました。");
//
//				}
				
				
			}


		}

		scanner.close();
	}

}
