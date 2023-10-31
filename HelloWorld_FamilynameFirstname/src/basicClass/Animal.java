package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog name1 = new Dog();
		System.out.println(name1.toString());

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog num1 = new Dog(5);
		System.out.println(num1.Animal_num);
		
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時を取得
		LocalDateTime date1 = LocalDateTime.now();

		// 表示形式を指定
		DateTimeFormatter dtformat = 
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String fdate1 = dtformat.format(date1); //表示形式+Stringに変換
		
		System.out.println(fdate1); // 2021/10/06 23:47:22.175
	}
}

