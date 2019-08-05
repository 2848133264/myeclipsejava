package PPT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import demo617.Student;

public class StreamTest1 {
	Random random;
	ArrayList<Student> stuList;

	@Before
	public void init() {
		random = new Random();
		stuList = new ArrayList<Student>() {
			{
				for (int i = 0; i < 100; i++) {
					add(new Student("student" + i, random.nextInt(50) + 50));
				}
			}
		};
	}

	@Test
	public void test1() {
		List<String> studentList = stuList.stream().filter(x -> x.getScore() > 85)
				.sorted(Comparator.comparing(Student::getScore).reversed()).map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(studentList);
	}
}