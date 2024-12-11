package SESenior.eg.fn.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketClient {
    public static String _pattern = "yyyy-MM-dd HH:mm:ss SSS";
    public static SimpleDateFormat format = new SimpleDateFormat(_pattern);
    // ���ó�ʱ��
    public static int _sec = 5;
 
    public static void main(String[] args) {
        System.out.println("----------Client----------");
 
        Socket socket = null;
        try {
            // �����˽�������
            socket = new Socket("127.0.0.1", 8001);
            socket.setSoTimeout(_sec * 1000);
 
            System.out.println(format.format(new Date()));
            System.out.println("����������\n");
 
            // ������д����
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
                         
            System.out.println(format.format(new Date()));
            System.out.println("����д��\n");
            Thread.sleep(10000);
            writer.write("��û���յ�\n");
             
            System.out.println(format.format(new Date()));
            System.out.println("д���� ������\n");
             
            writer.flush();
             
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
             
            System.out.println(format.format(new Date()) + "\n" + _sec + "���ʱ�� ���������յ�����\n");
 
            System.out.println(format.format(new Date()) + "\nServer:" + br.readLine());
             
        } catch (SocketTimeoutException e) {
            System.out.println(format.format(new Date()) + "\n" + _sec + "��û�յ��ظ� ������\n\n\n\n\n");
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
