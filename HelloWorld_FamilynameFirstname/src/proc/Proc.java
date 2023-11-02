package proc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Proc {
	String country;

	String review = "この寿司はうまい";
	String eat = "寿司は和食です";

	// 現在日時を取得
	LocalDateTime date1 = LocalDateTime.now();

	// 表示形式を指定
	DateTimeFormatter dtformat = 
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	// 表示形式+Stringに変換
	String fdate1 = dtformat.format(date1);
	String now = "今の現在日時は" + fdate1 + "です";
	// あいさつ文を出力するメソッド
	public void Proc1(String country) {
		this.country = country;
		//	nullチェック、countryがnullもしくは空文字なら
		if(country == null || country == ""){
			//	警告文の出力
			System.out.println("nullもしくは空の文字列です");
		}else {
			//	それ以外なら
			String greet = "こんにちは!ここは" + country + "です！";
			System.out.println(greet);
			System.out.println(review);
			System.out.println(eat);
			System.out.println(now);
		}


	}


}
