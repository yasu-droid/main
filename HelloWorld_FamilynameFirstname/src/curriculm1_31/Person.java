package curriculm1_31;

class Person{
	public String name;
	public int age;
	public double height;
	public double weight;
	public int count;

	Person(String name, int age, double height, double weight, int count){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count = count;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
	}
	public void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
	