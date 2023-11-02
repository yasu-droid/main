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
	
	String fdate1 = dtformat.format(date1); //表示形式+Stringに変換
	
	String now = "今の現在日時は" + fdate1 + "です";
	
	public void Proc1(String country) {
		this.country = country;
		
		if(country == null || country == ""){
			System.out.println("nullもしくは空の文字列です");
		}else {
			String greet = "こんにちは!ここは" + country + "です！";
			System.out.println(greet);
			System.out.println(review);
			System.out.println(eat);
			System.out.println(now);
		}

		
	}
	

}
