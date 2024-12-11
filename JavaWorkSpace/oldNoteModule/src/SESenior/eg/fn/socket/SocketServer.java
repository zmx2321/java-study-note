package SESenior.eg.fn.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketServer {
    public static String _pattern = "yyyy-MM-dd HH:mm:ss SSS";
    public static SimpleDateFormat format = new SimpleDateFormat(_pattern);
    // ���ó�ʱ��
    public static int _sec = 0;
 
    public static void main(String[] args) {
        System.out.println("----------Server----------");
        System.out.println(format.format(new Date()));
 
        ServerSocket server;
        try {
            server = new ServerSocket(8001);
            System.out.println("�������� ��������\n");
 
            Socket socket = server.accept();
            System.out.println(format.format(new Date()));
            System.out.println("����������\n");
 
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 
            socket.setSoTimeout(_sec * 1000);
            System.out.println(format.format(new Date()) + "\n" + _sec + "���ʱ�� ��д\n");
 
            System.out.println(format.format(new Date()) + "\nClient:" + br.readLine() + "\n");
 
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
             
            System.out.println(format.format(new Date()));
            System.out.println("����д�ظ�\n");
             
            writer.write("�յ�\n");
 
            Thread.sleep(10000);
            writer.flush();
             
            System.out.println(format.format(new Date()));
            System.out.println("д���� ������\n\n\n\n\n");
        } catch (SocketTimeoutException e) {
            System.out.println(format.format(new Date()) + "\n" + _sec + "��û�������� ������\n\n\n\n\n");
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
