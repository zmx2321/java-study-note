package SESenior.video.eg.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class NotePadDemo {
	public static void main(String[] args) {
		new MyFrame("���±�");
	}
}

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	//�����ı���
	private JTextArea tv_area = null;
	
	public MyFrame(String title){
		super(title);
		init();
		registerListener();
	}
	
	//��ʼ����ص����
	private void init(){
		tv_area = new JTextArea();
		Container cpane = this.getContentPane();
		cpane.add(tv_area, BorderLayout.CENTER);
		this.setSize(500, 300);  //���ô����С
		
		//�رմ��ڵ�ʱ���˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ھ�����ʾ
		//����һ�����߰�
		Toolkit kit = Toolkit.getDefaultToolkit();
		//�����Ļ�Ŀ�Ⱥ͸߶�
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;  //�����Ļ�Ŀ��
		int screenHeight = screenSize.height;  //�����Ļ�ĸ߶�
		
		int windowWidth = this.getWidth();  //��õ�ǰ����Ŀ��
		int windowHeight = this.getHeight();  //��õ�ǰ����ĸ߶�
		
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		
		this.setVisible(true);  //��ʾ����
	}
	
	//����ص����(�ؼ�)�����¼�������
	public void registerListener(){
		
	}
}