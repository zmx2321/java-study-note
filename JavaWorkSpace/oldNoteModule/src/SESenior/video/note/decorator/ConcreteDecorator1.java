package SESenior.video.note.decorator;

/**
 * BufferedInputStream
 * @author hjkjkj
 *
 */
public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	//��д�ӿڷ���
	@Override
	public void doThingA() {
		super.doThingA();  //���ðڰ�װ��ķ���
		doThingB();
	}
	
	//��չ
	private void doThingB(){
		System.out.println("do B thing");
	}
}
