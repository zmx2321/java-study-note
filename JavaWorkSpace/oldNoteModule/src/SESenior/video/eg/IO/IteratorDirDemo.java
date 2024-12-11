package SESenior.video.eg.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IteratorDirDemo {
	public static void main(String[] args) {
		IteratorUtil.IteratorDir(new File("D:/_site_/aaa"));
	}
}

class IteratorUtil{
	private static int level = 0;  //����㼶��
	
	//һ�������ṩ�ľ�̬�Ĺ�������
	public static void IteratorDir(File file){
		if(file!=null){
			//�ҳ��ݹ�ĳ���
			//�������ļ����ǿ��ļ��оͷ���
			if(file.isFile()||file.listFiles().length==0){
				return;
			}else{
				//�����ļ����е��ļ�
				File[] files = file.listFiles();
				//Ҫ����������ļ��У�������ļ�
				files = sort(files);
				//����
				for(File f:files){
					//��̬�ַ���
					StringBuilder sb = new StringBuilder();
					if(f.isFile()){
						sb.append(getTab(level));
						sb.append(f.getName());
					}else{
						sb.append(getTab(level));
						sb.append(f.getName());
						sb.append("\\");
					}
					System.out.println(sb.toString());
					
					//������ļ���
					if(f.isDirectory()){
						level++;  //����Ŀ¼�������㼶+1
						IteratorDir(f);  //�ݹ飬���ñ���Ŀ¼�ķ���
						level--;  //Ŀ¼�㼶-1������һ��Ŀ¼��������ӡ���
					}
				}
			}
		}
	}
	
	//���ݲ㼶���õ��Ʊ���ĸ���������ɵ��ַ�����
	private static String getTab(int level){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<level; i++){
			sb.append("\t");
		}
		
		return sb.toString();
	}
	
	/**
	 *  ��File���͵����������Ŀ¼���ļ�������
	 */
	//ֻΪ�������ķ���
	private static File[] sort(File[] files){
		List<File> fList = new ArrayList<>();
		
		//�ȴ���ļ���
		for(File f:files){
			//������ļ���
			if(f.isDirectory()){
				fList.add(f);
			}
		}
		
		//�ٴ���ļ�
		for(File f:files){
			//������ļ�
			if(f.isFile()){
				fList.add(f);
			}
		}
		
		//�Ѽ����е�Ԫ��ת����ָ����С��ָ�����͵�����
		return fList.toArray(new File[fList.size()]);
	}
}
