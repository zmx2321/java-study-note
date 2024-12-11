package SESenior.video.note.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		//ջ
		MyStack<String> myStack = new MyStack<>();
		
		//ѹջ
		myStack.push("zhangsan");
		myStack.push("lisi");
		myStack.push("wangwu");
		myStack.push("zhaoliu");
		
		//��ջ
		myStack.pop();
		myStack.pop();
		
		//����
		Iterator<String> it1 = myStack.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		//����
		MyQueue<Integer> myQueue = new MyQueue<>();
		
		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.push(4);
		myQueue.push(5);
		
		myQueue.pop();
		myQueue.pop();
		
		Iterator<Integer> it2 = myQueue.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
}

//ջ(����)
class MyStack<T> {
	//��LinkedList����
	private LinkedList<T> data = null;
	
	//���췽��
	public MyStack(){
		//����һ����������
		data = new LinkedList<T>();
	}
	
	//push����(ѹջ�ķ���)
	public void push(T obj){
		data.addFirst(obj);
	}
	
	//��ջ�ķ���
	public T pop(){
		return data.removeFirst();
	}
	
	//�õ���������
	public Iterator<T> iterator(){
		return data.iterator();
	}
}

//����
class MyQueue<T>{
	private LinkedList<T> data = null;
	public MyQueue(){
		data = new LinkedList<T>();
	}
	
	public void push(T obj){
		data.addFirst(obj);
	}
	
	public T pop(){
		return data.removeLast();
	}
	
	public Iterator<T> iterator(){
		return data.iterator();
	}
}