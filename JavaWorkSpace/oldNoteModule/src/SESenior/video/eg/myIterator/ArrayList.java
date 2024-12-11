package SESenior.video.eg.myIterator;

public class ArrayList<T> implements List<T> {
	private Object[] obj = null;  //����һ��Object���͵�����
	//���Ͳ���������������
	private int index;  //������±�
	private int size;  //��¼�����е�Ԫ�ظ���
	
	public ArrayList(){
		obj = new Object[10];
		index = 0;
		size = 0;
	}
	
	@Override
	public void add(T obj) {
		//�����ݴ����������
		this.obj[index++] = obj;
		//Ԫ�ظ�����һ
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T)this.obj[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(this);
	}

}
