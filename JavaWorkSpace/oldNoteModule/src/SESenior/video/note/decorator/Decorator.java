package SESenior.video.note.decorator;

/**
 * װ����--FilterInputStream
 * @author hjkjkj
 *
 */
public class Decorator implements Component {
	//����Component�����ʵ��������Component���͵����ñ���
	private Component component = null;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	@Override
	public void doThingA() {
		//���ñ�װ�ζ���ķ���
		component.doThingA();
	}
}
