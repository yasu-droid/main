package curriculm1_31;

class Main{
	public static void main(String[] argos){
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60,1);
		person1.print();
		System.out.println("合計" + person1.count + "人です\r\n");
		person1.printCount();
		
		Person person2 = new Person("山田花子", 22, 1.5, 40,1);
		person2.print();
		System.out.println("合計" + person1.count + "人です");
		person2.printCount();

	}
}
