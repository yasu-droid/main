package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 横列の数字を配列に
		 int[] numberswide = new int[20];
			// 縦列の数字を配列に
	        int[] numbersvert = new int[9];
			// 横列の1-20を出力
	        for (int i = 1; i <= 20; i++) {
	            numberswide[i - 1] = i;
	        }
			// 縦列の1-9を出力
	        for (int j = 1; j <= 9; j++) {
	            numbersvert[j - 1] = j;
	        }
			// 多次元配列にして、すべての組み合わせをつくり、表示する
	        int[][] numbersW = new int[numberswide.length][numbersvert.length];
			// numberswideの配列の長さ分繰り返す
	        for (int i = 0; i < numberswide.length; i++) {
				// numbersvertの配列の長さ分繰り返す
	            for (int j = 0; j < numbersvert.length; j++) {
	                numbersW[i][j] = numberswide[i] * numbersvert[j];
					// 3桁表示して、コンソールに出力
	                System.out.print(String.format("%03d", numberswide[i]) + "*" + String.format("%03d", numbersvert[j]) + "=" + String.format("%03d", numbersW[i][j]));
	                if (j != numbersvert.length - 1) {
	    				// 表示された多次元配列の間に||を挿入
	                    System.out.print("||");
	                }
	            }
				// 段落ごとに改行
	            System.out.println();
	        }
	}

}
