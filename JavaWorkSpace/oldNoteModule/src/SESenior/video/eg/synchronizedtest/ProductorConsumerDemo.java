package SESenior.video.eg.synchronizedtest;

import java.util.LinkedList;

public class ProductorConsumerDemo {
	public static void main(String[] args) {
		//����ʵ�ֽӿڵ�ʵ����
		Basket basket = new Basket();
		//�����̶߳���
		Productor productor = new Productor(basket);
		Consumer consumer = new Consumer(basket);
		
		productor.start();  //����������
		consumer.start();  //����������
	}
}

//������
class Consumer extends Thread{
	private Basket basket = null;

	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
		basket.popApple();
	}
}

//������
class Productor extends Thread{
	private Basket basket = null;

	public Productor(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
		basket.pushApple();
	}
}

//������
class Basket{
	private LinkedList<Apple> basket = new LinkedList<>();
	
	//��4��ƻ��(ͬ������)�ŵ�ʱ���ܳ�
	public synchronized void pushApple(){
		for(int i=0; i<20; i++){
			Apple apple = new Apple(i);
			
			push(apple);
		}
	}
	
	//ȡ4��ƻ��
	public synchronized void popApple(){
		for(int i=0; i<20; i++){
			pop();
		}
	}
	
	//��ƻ������(����ʹ��)
	private void push(Apple apple){
		//�������д����5��ƻ���͵ȴ���֪ͨ������������
		if(basket.size()==5){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //�ȴ����ͷŵ�ǰ�������
		}
		
		//ÿ��0.5���һ��ƻ��
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		basket.addFirst(apple);
		
		System.out.println("��ţ�" + apple.toString());
		
		notify();  //֪ͨ������������
	}
	
	//ȡƻ������
	private void pop(){
		//��������ƻ��ζ0ʱ�͵ȴ���֪ͨ����������
		if(basket.size()==0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //�ȴ����ͷŵ�ǰ�������
		}
		
		//ÿ��0.5���һ��ƻ��
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Apple apple = basket.removeFirst();
		
		System.out.println("�Ե���" + apple.toString());
		
		notify();  //֪ͨ����������
	}
}

//ƻ����
class Apple{
	private int id;
	
	public Apple(int id){
		this.id = id;
	}

	@Override
	public String toString() {
		return "ƻ��" + (id+1);
	}
}
