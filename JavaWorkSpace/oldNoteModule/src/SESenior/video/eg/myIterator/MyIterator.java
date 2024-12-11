package SESenior.video.eg.myIterator;

public class MyIterator<T> implements Iterator<T> {
	private List<T> list = null;
	private int index = 0;  //���ʵ�������Ԫ�صĵ�ǰ�±�
	
	//����һ�������������ʱ�����Ҫ�������ľ������������
	public MyIterator(List<T> list){
		this.list = list;
	}
	
	//�ж��Ƿ�����һ��Ԫ��
	@Override
	public boolean hasNext() {
		return index<list.size();  //list.sizeԪ�ظ���
	}

	//ȥ����һ��Ԫ��
	@Override
	public T next() {
		return list.get(index++);
	}
}
