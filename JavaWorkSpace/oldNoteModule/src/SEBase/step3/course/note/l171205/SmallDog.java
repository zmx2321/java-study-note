package SEBase.step3.course.note.l171205;

public class SmallDog extends Dog {

	/*public SmallDog() {
		System.out.println("smalldog�޲Ρ���������������������");
	}*/
	
	public SmallDog(String name) {
		super(name);
		System.out.println("smalldog..............");
	}
	
	public SmallDog(String name , int age) {
		super(name);
		//this(name);
		System.out.println("smalldog..............");
	}
	
	public void eat(){
		super.eat();
		System.out.println("�Ұ���ţ��...........");
	}
	
	public void eat(String food){
		super.eat();
		System.out.println("�Ұ���"+food+"...........");
	}
	
}
