package task;

import java.util.Date;

public enum  character{
	
	Admin("����Ա",new Date().getTime()),
	User("��ͨ�û�",new Date().getTime());
	
	private String name;
	private long lifttime;
	
	character(String name ,long lifetime) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.lifttime =lifetime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLifttime() {
		return lifttime;
	}

	public void setLifttime(long lifttime) {
		this.lifttime = lifttime;
	}
 
}
