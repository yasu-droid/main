package curriculm1_28main;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import curriculum1_28prefecture.Date;

public class Main {

    public static void main(String[] args) {
        String[] namePrefecture =  Date.prefecture_name();
        String[] nameCity =  Date.city_name();
        String[] numArea =  Date.area_num();

        // コンソールで入力を受け取り
        Scanner scanner = new Scanner(System.in);
        System.out.println("数字を入力してください");
        String search_num = scanner.next();

        // コンソールに入力した文字を「,」毎に区切り、配列にする
        String[] array_num = search_num.split(",");

        // string型の配列 array_num を int型の配列 intArray_num にする
        Integer[] intArray_num = new Integer[array_num.length];
        for (int i = 0; i < intArray_num.length; i++) {
            intArray_num[i] = Integer.parseInt(array_num[i]);
        }

        String order_num = scanner.next();
        if (order_num.equals("昇順")) {
            // 配列 intArray_num 内の数字を昇順にする
            Arrays.sort(intArray_num);

            for (int i = 0; i < intArray_num.length; i++) {
                int index = intArray_num[i];

                if (0 <= index && index <= 10) {
                    System.out.println("都道府県名:" + namePrefecture[index]);
                    System.out.println("県庁所在地:" + nameCity[index]);
                    System.out.println("県庁所在地:" + numArea[index] + ".0km2");
                    System.out.println("");
                } else {
                    System.out.println(index + "の該当の情報はありません");
                    System.out.println("");
                }
            }
            System.out.println(Arrays.toString(intArray_num));
        } else if (order_num.equals("降順")) {
            // 配列 intArray_num 内の数字を降順にする
            Arrays.sort(intArray_num, Collections.reverseOrder());

            for (int i = 0; i < intArray_num.length; i++) {
                int index = intArray_num[i];

                if (0 <= index && index <= 10) {
                    System.out.println("都道府県名:" + namePrefecture[index]);
                    System.out.println("県庁所在地:" + nameCity[index]);
                    System.out.println("県庁所在地:" + numArea[index] + ".0km2");
                    System.out.println("");
                } else {
                    System.out.println(index + "の該当の情報はありません");
                    System.out.println("");
                }
            }
        } else {
            System.out.println("不正な入力");
        }

        scanner.close();
    }
}