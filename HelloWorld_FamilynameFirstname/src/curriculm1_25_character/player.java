package curriculm1_25_character;
//playerの名前を入力、ステータスを乱数

import java.util.Random;
import java.util.Scanner;

public class player extends character{
	
    Scanner scanner = new Scanner(System.in);
    String insert = scanner.next();

    
    Random rand = new Random();
    int num = rand.nextInt(1000);
    

    
}
