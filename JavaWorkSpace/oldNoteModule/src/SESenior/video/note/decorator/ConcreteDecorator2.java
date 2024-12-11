package SESenior.video.note.decorator;

/**
 * BufferedInputStream
 * @author hjkjkj
 *
 */
public class ConcreteDecorator2 extends Decorator {
	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	//��д�ӿڷ���
	@Override
	public void doThingA() {
		super.doThingA();  //���ðڰ�װ��ķ���
		doThingC();
	}
	
	//��չ
	private void doThingC(){
		System.out.println("do C thing");
	}
}
