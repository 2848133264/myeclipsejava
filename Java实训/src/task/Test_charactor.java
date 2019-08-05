package task;

import java.util.Date;

public class Test_charactor {
	
	public static void main(String[] args) {
		character.Admin.setName("π‹¿Ì‘±");
		character.Admin.setLifttime(new Date().getTime());
		String name = character.Admin.getName();
		long date =character.Admin.getLifttime();
		
		System.out.println(name + ","+date);
		
	}

}
