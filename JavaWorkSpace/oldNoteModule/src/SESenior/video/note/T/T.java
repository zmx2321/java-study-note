package SESenior.video.note.T;

public class T {
	public static void main(String[] args) {
		//List<E> -> E��ʾԪ��element
		//Map<K, V>
		
		//��Object���Խ��������������͵�����
		Test2 t2 = new Test2();
		t2.setData(123);
		t2.setData("aa");
		t2.setData(12.5);
		System.out.println(t2.getData());
		
		//Objectȱ��
		//��Objectת�������ClassCastException�쳣
		//double����תString
		//Ҫ��instanceof
		//System.out.println((String)t2.getData());
		
		//������
		Test3<String> t3 = new Test3<String>();
		Test3<Integer> t3_1 = new Test3<Integer>();
		t3.setData("aaa");
		t3_1.setData(132);
		System.out.println(t3.getData());
		System.out.println(t3_1.getData());
		
		//���ͷ���
		@SuppressWarnings("unused")
		Test4 t4 = new Test4();
	}
}

@SuppressWarnings("hiding")
class  Test1<T> {} //������

//Object����������������
class  Test2 {
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}

//���ͽ���������������
@SuppressWarnings("hiding")
class Test3<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

//���ͷ���
@SuppressWarnings("hiding")
class Test4{
	//��ͨ����
	//public void show(String name){}
	
	//���ͻ����÷�
	public <T> void show(T obj){}
	
	//���Ʒ���ֻ������������
	//public <T extends Test3> void show(T obj){}
}


