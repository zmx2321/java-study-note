package SEBase.step3.course.note.l171203;

public class SingleDemo {

	private SingleDemo() {}
	private static SingleDemo sin = null;
	
	public static SingleDemo getInstance(){
		if(sin ==null){
			sin = new SingleDemo();
		}
		return sin;
	}
	
}
