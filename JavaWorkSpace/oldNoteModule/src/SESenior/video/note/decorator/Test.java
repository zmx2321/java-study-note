package SESenior.video.note.decorator;

public class Test {
	public static void main(String[] args) {
		ConcreteComponent Ccmponent = new ConcreteComponent();
		
		Ccmponent.doThingA();  //��������
		
		//��װ������������а�װ
		ConcreteDecorator1 decorator1 = new ConcreteDecorator1(Ccmponent);
		decorator1.doThingA();  //2������
		
		ConcreteDecorator2 decorator2 = new ConcreteDecorator2(decorator1);
		decorator2.doThingA();
	}
}
