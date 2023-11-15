package curriculm1_30;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7 , 60);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println("");
		person1.bmi();
    	person1.sum_people();
		person1.print();


	}
}
