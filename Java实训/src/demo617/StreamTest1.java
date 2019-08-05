package demo617;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class StreamTest1 {
	Random random;
	ArrayList<Student> stuList;

	public void init() {
		random = new Random();
		stuList = new ArrayList<Student>() {

			private static final long serialVersionUID = 1L;
			{
				for (int i = 0; i < 100000; i++) {
					add(new Student("student" + (i + 1), random.nextInt(50) + 50));
				}
			}
		};	
	}
	public void Test2(){
		List<Student> list =new ArrayList<>();	
		for (Student student : stuList) {	
			if(student.getScore() > 85){
				list.add(student);
			}
		}
		list.sort(Comparator.comparing(Student::getScore));
		//System.out.println(list);
	}
	
	public void test1() {
		List<String> studentList = stuList.stream().parallel()
				.filter(x -> x.getScore() > 85)
				.sorted(Comparator.comparing(Student::getScore).reversed())
				.map(Student::getName)
				.collect(Collectors.toList());
		
		//System.out.println(studentList);
	}
	public static void main(String[] args) {
		
		StreamTest1 ss= new StreamTest1();
		ss.init();
		long startTime =System.nanoTime();	
		ss.test1();
		long endTime =System.nanoTime();
		long spendTime =endTime-startTime;
		System.out.println("Stream流方式："+spendTime+"ns");
		
		long startTime1 =System.nanoTime();	
		ss.Test2();
		long endTime1 =System.nanoTime();
		long spendTime1 =endTime1-startTime1;
		System.out.println("NoStream方式："+spendTime1+"ns");
		
	}
}