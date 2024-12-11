package SESenior.course.note.thread;

/**
 * 
 * java�߳�Thread
 *
 */

public class Class1 {
	/*
	 *  �̵߳���������
	 	���� -- ���� -- ִ�� -- ����
					      -- ˯�� -- ִ�� -- ����
	    				  -- ���� -- ���� -- ���� -- ִ�� -- ����
	 
	 */
	/**
	 * test
	 * @param args
	 */
	//���������
	public static void main(String[] args) {
		//demo1();
		
		//�����߳�
		//demo2();
		
		demo3();
		System.out.println("main�߳̽���");
	}
	
	//��ǰ�̵߳�����
	public static void demo1(){
		System.out.println(Thread.currentThread().getName());
	}
	
	//�����߳���
	public static void demo2(){
		//�����ѭ����n����ס�������仰���ͻῪn���߳�
		//һ������һ��star����
		HelloThread ht = new HelloThread();
		ht.start();  //�����߳�,java�߳��Զ�ִ��run����
		
		//���̣߳�������ͬ�����߳�main�̣߳�
		String ThreadName = Thread.currentThread().getName();
		for(int i=50; i<=60; i++){
			System.out.println(ThreadName + " for i=" + i);
		}
	}
	
	//�����߳̽ӿ�
	public static void demo3(){
		Thread thread = new Thread(new HelloRunnable());
		thread.start();
		
		//���̣߳�������ͬ�����߳�main�̣߳�
		String ThreadName = Thread.currentThread().getName();
		for(int i=100; i>=80; i--){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ThreadName + "��" + i);
		}
	}
}
