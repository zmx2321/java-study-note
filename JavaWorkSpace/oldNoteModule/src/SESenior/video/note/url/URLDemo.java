package SESenior.video.note.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
/*import java.net.URLConnection;*/

public class URLDemo {
	public static void main(String[] args) {
		try {
			DownLoadUtil.download("https://www.baidu.com/img/bd_logo1.png", "my.jpg", "d:\\_____");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//������
class DownLoadUtil{
	//�õ�������������˲����쳣
	public static void download(String urlString, String fileName, String savePath) throws IOException{
		//����url����
		URL url = new URL(urlString);
		//��������Դ��������
		/*URLConnection conn = url.openConnection();*/
		//��ΪҪ���أ�����Ҫ�������(������Դ)������
		/*InputStream is = conn.getInputStream();*/
		
		//�滻��һ�����(�Ƚ������Ӳ�����һ���ֽ�������)
		InputStream is = url.openStream();
		
		//����
		//׼��һ��������
		byte[] buff = new byte[1024];
		//ʵ�ʶ����ĳ���
		int len = 0;
		//����һ��Ŀ¼
		File file = new File(savePath);
		//�ж�Ŀ¼�Ƿ����
		if(!file.exists()){
			//�����ھʹ���һ��Ŀ¼
			file.mkdirs();
		}
		//����(д)
		FileOutputStream os = new FileOutputStream(file.getAbsolutePath() + "\\" + fileName);
		//����������
		while((len=is.read(buff))!=-1){
			//�ѻ������е�����д����Ӧ���������ȥ(ָ��Ŀ¼��ָ���ļ���)
			os.write(buff, 0, len);
		}
		//�ͷ���Դ
		os.close();
		is.close();
		
		System.out.println("ͼƬ���سɹ���");
	}
}
