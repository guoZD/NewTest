
public class objectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student("liming",12);
		Student stu2 = new Student("liming",12);
		stu2.setAge(98);
		stu2.setName("dajia");
		System.out.println(stu);
		System.out.println(stu2);
		int s = 2;
		int s2 = s;
		s2++;
		System.out.println("s:"+s);
		System.out.println("s2:"+s2);
	}

}
class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}