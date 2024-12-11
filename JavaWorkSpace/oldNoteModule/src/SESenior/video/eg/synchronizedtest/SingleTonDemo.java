package SESenior.video.eg.synchronizedtest;

public class SingleTonDemo {
	public static void main(String[] args) {
		//���߳�(���߳�)ģʽ�µ���2��getInstance����
		//ֻ����һ������
		/*SingleTon.getInstance();
		SingleTon.getInstance();*/
		
		//����һ��ʵ��Runnable�ӿڵ�ʵ�������
		SThread sThread = new SThread();
		
		//����3���߳������,����ʵ��Runnable�ӿڵ�ʵ����
		Thread t1 = new Thread(sThread);
		Thread t2 = new Thread(sThread);
		Thread t3 = new Thread(sThread);
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}

//�߳���(ʵ��Runnable�ӿ�)
class SThread implements Runnable{
	@Override
	public void run() {
		SingleTon.getInstance();
	}
}

class SingleTon{
	//����һ��SingleTon������ñ���
	//��̬����ֻ�ܷ����ⲿ�ľ�̬����
	private static SingleTon singleTon = null;
	
	/*
	 *  ����ģʽ�������ⲿnew������ֻ�����ڲ�
	 *  ����һ������ģʽ������������ⲿ��������
	 *  ���ã��������Ĺ��췽����˽�е�
	 *  
	 *  ��һ���࣬���췽��ֻ��ִ��һ�ε�ʱ��
	 *  ˵����ֻ������һ������
	 */
	//��ʽ����˽�еĹ��췽��
	private SingleTon(){
		System.out.println("����");
	}
	
	/*
	 *  �ⲿ�޷�new���������(��Ϊ���췽��˽��)
	 *  ����ֻ�����ڲ������ķ����������ڲ����������
	 *  �ĵ�������
	 *  
	 *  ��Ϊ���ܲ����ⲿ�������Բ��ܲ������еķ���
	 *  ����ѷ�����Ϊ��̬����˵��������������࣬����
	 *  ֱ�ӷ��ʸ÷���(�෽�������Ƕ��󷽷�)
	 */
	//�����ṩһ������
	public static SingleTon getInstance(){
		//����һ���߳̽������ڶ����߳̾�û��Ҫ�ٽ����ж�
		if(singleTon==null){
			//��ͬ������ס�÷�������������ִ��
			//����̹߳�ͬ��õĶ�����
			//SingleTon.class
			/*
			 *  ÿһ���඼��Ψһ��class����
			 *  ����SingleTon����Ҳ������class����
			 *  
			 *  ����һ���̹߳�����ʱ�򣬻����
			 *  SingleTon.class������������ִ��
			 *  �ڶ����߳���Ϊ����ֻ�ܵȴ���
			 *  ��һ���߳�ִ����ϣ��Զ��ͷ�����
			 *  �ڶ����߳�ִ�У�������
			 */
			synchronized (SingleTon.class) {
				if(singleTon==null){  //���������ñ���Ϊnull��û�о���ʵ����[new]��˵����δ���������������
					singleTon = new SingleTon();  //����һ������
				}
			}
		}
		
		return singleTon;  //����Ѿ����������򷵻�
	}
	
}
