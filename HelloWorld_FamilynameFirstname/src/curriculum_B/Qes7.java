package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		//コンソールで人数の入力を受付
		System.out.print("生徒の人数を入力してください（２名以上）: ");
		int people = scanner.nextInt();

		if (people <= 1) {
			System.out.println("2以上の数字を入力してください");

		} else {
			int[] English = new int[people]; // 英語の点数を格納する配列
			int[] Math = new int[people]; // 数学の点数を格納する配列
			int[] Science = new int[people]; // 理科の点数を格納する配列
			int[] Society = new int[people]; // 社会の点数を格納する配列
			double[] average = new double[people]; // 教科ごとの平均点を格納する配列

			// 英語の合計
			int sumEnglish = 0; 
			// 数学の合計
			int sumMath = 0;
			// 化学の合計
			int sumScience = 0;
			// 社会の合計
			int sumSociety = 0;

			for (int i = 0; i < people; i++) {
				System.out.print((i + 1) + "人目の「英語」を入力してください：");
				//i+1人目の英語の点数をコンソールで入力
				English[i] = scanner.nextInt();
				//英語の合計の計算
				sumEnglish += English[i];

				System.out.print((i + 1) + "人目の「数学」を入力してください：");
				//i+1人目の数学の点数をコンソールで入力
				Math[i] = scanner.nextInt();
				//数学の合計の計算
				sumMath += Math[i];

				System.out.print((i + 1) + "人目の「理科」を入力してください：");
				//i+1人目の化学の点数をコンソールで入力
				Science[i] = scanner.nextInt();
				//化学の合計の計算
				sumScience += Science[i];

				System.out.print((i + 1) + "人目の「社会」を入力してください：");
				//i+1人目の社会の点数をコンソールで入力
				Society[i] = scanner.nextInt();
				//社会の合計の計算
				sumSociety += Society[i];
				//生徒ごとのテストの平均点の計算
				average[i] = (English[i] + Math[i] + Science[i] + Society[i]) / 4.0;
				//生徒の点数ごとに改行
				System.out.println("");
			}

			for (int i = 0; i < people; i++) {
				//生徒ごとのテストの平均点のコンソールに表示
				System.out.println((i + 1) + "人目の平均点は、" + String.format("%.2f", average[i]) + "点です。");
			}
			System.out.println("");

			//すべての生徒の英語の平均点
			double avgEnglish = (double) sumEnglish / people;
			//すべての生徒の数学の平均点
			double avgMath = (double) sumMath / people;
			//すべての生徒の化学の平均点
			double avgScience = (double) sumScience / people;
			//すべての生徒の社会の平均点
			double avgSociety = (double) sumSociety / people;
			//すべての生徒のテストの平均点
			double sumaverage = (sumEnglish + sumMath + sumScience + sumSociety) / (4.0 * people);

			//すべての生徒の英語の平均点をコンソールに出力
			System.out.println("英語の平均点は" + String.format("%.2f", avgEnglish) + "点です。");
			//すべての生徒の数学の平均点をコンソールに出力
			System.out.println("数学の平均点は" + String.format("%.2f", avgMath) + "点です。");
			//すべての生徒の化学の平均点をコンソールに出力
			System.out.println("化学の平均点は" + String.format("%.2f", avgScience) + "点です。");
			//すべての社会の英語の平均点をコンソールに出力
			System.out.println("社会の平均点は" + String.format("%.2f", avgSociety) + "点です。");
			//すべての生徒のテストの平均点をコンソールに出力
			System.out.println("全体の平均点は" + String.format("%.2f", sumaverage) + "点です。");
		}

	}
}