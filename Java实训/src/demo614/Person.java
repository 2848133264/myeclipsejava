package demo614;

public class Person implements Cloneable {
	// ����
	private String name;
	// ����
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

	/* name��parent��getter/setter����ʡ�� */

	public static void main(String[] args) throws Exception {
		Person f = new Person("Сͷ�ְ�");// ���常��
		Person s1 = new Person("�����", f);// ��������
		// С���ӵ���Ϣ��ͨ������ӿ���������
		Person s2 = (Person) s1.clone();
		s2.setName("С����");
		// �˸���
		s1.getFather().setName("�ɵ�");// �������õ�setname�������˹����name
		System.out.println(s1.getName() + "�ĸ�����" + s1.getFather().getName());
		System.out.println(s2.getName() + "�ĸ�����" + s2.getFather().getName());

		//�������Ϣ��ȫcopy����ǳ����������copy�����𣬴�����ǳ������
		/**
		 * ����Object�е�clone������ ʵ�����
		 */
		System.currentTimeMillis();
		System.nanoTime();
	}

}