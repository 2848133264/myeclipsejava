package demo616;
class Body implements Cloneable{  
    public Head head;  
      
    public Body() {}  
  
    public Body(Head head) {this.head = head;}  
  
    @Override  
    protected Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    } 
    
      
}  

class Face{
	
}
 class Head /* implements Cloneable */ {
	public Face face;

	public Head() {
	}

	public Head(Face face) {
		this.face = face;
	}

}
 public class Test{
	 
 public static void main(String[] args) throws CloneNotSupportedException {
		Body body = new Body(new Head());

		Body body1 = (Body) body.clone();

		System.out.println("body == body1 : " + (body == body1));

		System.out.println("body.head == body1.head : " + (body.head == body1.head));
		
 }}
