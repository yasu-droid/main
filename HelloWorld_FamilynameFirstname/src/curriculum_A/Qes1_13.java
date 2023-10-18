package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問１		
		byte a;//バイト型
		short b;//短整数型
		int c;//整数型
		long d ;//長い整数型

		float decnum;//単精度浮動小数点数型
		double nums;//倍精度浮動小数点数型

		int word;//文字型
		String msg ;//文字列型;
		boolean b1;//boolean型

		//		問2
		a = 0;
		b = 1;
		c = 2;
		d = 3;

		decnum = 4f;
		nums = 5;
		word = a;
		msg = "こんにちは";
		b1 = false;

		//		問3
		a = 10;
		b = 100;
		c = 1000;
		d = 10000;

		decnum = 9.5f;
		nums = 10.5;
		word = a;
		msg = "ハロー";
		b1 = true;


		//		問4 11110のコンソールへの出力
		double sum = a + b + c + d;
		System.out.println(sum);

		//		20の出力
		int multi = a * 2;
		System.out.println(multi);

		//		11130の出力
		System.out.println(sum + multi);

		//		10000000000の出力
		long multiabcd = a * b * c * d;	
		System.out.println(multiabcd);

		//		0.105の出力
		double divi = nums / b;
		System.out.println(divi);

		//		-90の出力
		int subtra = a - b;
		System.out.println(subtra);

		//		問5
		int num = 20;
		int num1 = 23;	
		System.out.println("ハローJAVA"+(num+num1));

		//		問6
		String name = "山田太郎";
		short age = 18;
		double height = 170.5;
		double weight = 62.2;
		String eat = "寿司";
		System.out.println("初めまして"+(name)+"です");
		System.out.println("年齢は"+(age)+"歳です");
		System.out.println("身長は"+(height)+"cmです");
		System.out.println("体重は"+(weight)+"kgです");
		System.out.println("好きな食べ物は"+(eat)+"です");

		//		問7
		height = height/100;
		double BMI = weight / (height*height);
		System.out.println("BMIは"+String.format("%.1f", BMI)+"です");

		//		問8
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		eat = "オムライス";
		double height2 = height/100;
		double BMI2 = weight/(height2*height2);
		System.out.println("初めまして"+(name)+"です");
		System.out.println("年齢は"+(age)+"歳です");
		System.out.println("身長は"+(height)+"cmです");
		System.out.println("体重は"+(weight)+"kgです");
		System.out.println("好きな食べ物は"+(eat)+"です");
		System.out.println("BMIは"+String.format("%.1f", BMI2)+"です");

		//		問9
		age += age;
		double height3 = height*2;
		double  weight2 = weight*2;
		double height4 = height3/100;
		BMI2 = weight2/(height4*height4);
		System.out.println("初めまして"+(name)+"です");
		System.out.println("年齢は"+(age)+"歳です");
		System.out.println("身長は"+(height3)+"cmです");
		System.out.println("体重は"+(weight)+"kgです");
		System.out.println("好きな食べ物は"+(eat)+"です");
		System.out.println("BMIは"+String.format("%.1f", BMI2)+"です");


		//		問10
		boolean isOver25; // boolean型の変数を宣言
		age = 24;
		isOver25 = (age >= 25); // 【条件式】
		System.out.println(isOver25);

		//        問11
		String ageWord  = ""+ age ;
		String heightWord  = ""+ height ;
		String weightWord  = ""+ weight ;
		System.out.println(ageWord+heightWord+weightWord);

		//        問12
		 int ageInteger = Integer.parseInt(ageWord);
		 System.out.println(ageInteger);
		 
		 int heightInteger = (int)Double.parseDouble(heightWord);
		 System.out.println(heightInteger);

	}

}
