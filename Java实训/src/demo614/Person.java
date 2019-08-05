package demo614;

public class Person implements Cloneable {
	// 姓名
	private String name;
	// 父亲
	private Person father;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person(String string, Person f) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.father = f;
	}

	public Person(String string) {
		// TODO Auto-generated constructor stub
		this.name = string;
	}

	/* name和parent的getter/setter方法省略 */

	public static void main(String[] args) throws Exception {
		Person f = new Person("小头爸爸");// 定义父亲
		Person s1 = new Person("大儿子", f);// 定义大儿子
		// 小儿子的信息是通过大儿子拷贝过来的
		Person s2 = (Person) s1.clone();
		s2.setName("小儿子");
		// 人跟跌
		s1.getFather().setName("干爹");// 这里设置的setname：传给了共享的name
		System.out.println(s1.getName() + "的父亲是" + s1.getFather().getName());
		System.out.println(s2.getName() + "的父亲是" + s2.getFather().getName());

		//深拷贝（信息完全copy）和浅拷贝（部分copy的区别，此题是浅拷贝。
		/**
		 * 覆盖Object中的clone方法， 实现深拷贝
		 */
		System.currentTimeMillis();
		System.nanoTime();
	}

}