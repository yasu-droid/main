package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18{

 // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
 private static void hello(String name, int num) {

  System.out.println(name + num);
 }
 // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
 private static void multi(int multinum1, int multinum2) {

  System.out.println(multinum1 * multinum2);
 }
 // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
 private static void order(int[] ordernum) {

  //配列を分割させる
  for (int i = 0; i < ordernum.length; i++) {
   System.out.print(ordernum[i]);
  }
  System.out.println("");

 }
 // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
 private static void multi(double multinum1, double multinum2) {

  System.out.println(multinum1 + multinum2);
 }
 // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
 // 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
 // ※0は出力＆格納しないようにしてください。
 private static int[] randnum(int count) {
  Random rand = new Random();
  int date[] = new int[count];
  for(int i = 0;i < count; i++) {
   //0～9のランダムな値を表示
   int randchoice = rand.nextInt(99) + 1;
   date[i] = randchoice;

  }
  System.out.println(Arrays.toString(date));

  return date;
 }
 // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
 // ※小数点以下も表示されるようにしてください。
 private static double ave(int[] cons) {

  
  double sum = 0;

  double average = 0;
// 配列内の合計を出す
  for(int i = 0; i < cons.length; i++) {
   sum += cons[i];
  }
// 平均を出す
  average = sum/cons.length;
  System.out.println(average);
  return average;
 }


 // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
 private static boolean judge(double jud) {
// 判定結果をflagに格納して返す
  boolean flag = false;
// judの中が50以上なら
  if(jud <= 50) {
// flagをそのまま出す
   System.out.println(flag);
// それ以外なら
  }else {
// flagにtrueを代入する
   flag = true;
   System.out.println(flag);
  }
//
  return flag;
 }



 public static void main(String[] args) {
  // 作成したメソッドをここで呼び出してください
  // Q1
  hello("Hello JavaSE ", 11);
  // Q2
  multi(12 , 12);
  // Q3
  int ordernum[] = {0, 1, 2};
  order(ordernum);
  // Q4
  multi(1.1 , 1.1);
  // Q5
  randnum(4);
  // Q6
  ave(randnum(4));
  // Q7
  judge(ave(randnum(4)));
 }
}