package demo614;

import java.util.HashSet;
import java.util.Set;

public class Test15 {
	private String firstName, lastName;

	public Test15(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test15 other = (Test15) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Set<Test15> s = new HashSet<Test15>();
		s.add(new Test15("Mickey", "Mouse"));
		System.out.println(s.contains(new Test15("Mickey", "Mouse")));
	}
	//产生 的 hashcode 的值不一样。重写equals 和hash方法
}