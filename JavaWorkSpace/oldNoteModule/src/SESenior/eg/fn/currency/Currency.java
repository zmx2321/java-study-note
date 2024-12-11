package SESenior.eg.fn.currency;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency {
	private final static String[] STR_NUMBER = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
	private final static String[] STR_UNIT = { "", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ" };// ������λ
	private final static String[] STR_UNIT2 = { "��", "��", "��" };// С����λ

	public static void main(String[] args) {
		while (true) {
			String convert = convert(getScanner());
			System.out.println(convert);
		}
	}

	// 1.���ת������convert();
	public static String convert(double m) {
		// ʵ����DecimalFormat����
		DecimalFormat df = new DecimalFormat("#0.###");
		// ��ʽ��double����
		String strNum = df.format(m);
		// �ж��Ƿ����С����
		if (strNum.indexOf(".") != -1) {
			String num = strNum.substring(0, strNum.indexOf("."));// ȡ��������
			// �������ִ���12λ����װ��������λ�������ǧ�ڣ�
			if (num.length() > 12) {
				System.out.println("���̫�󣬲������װ����");
				return "";
			}
		}
		String point = null; // С����
		if (strNum.indexOf(".") != -1) {
			point = "Ԫ";
		} else {
			point = "Ԫ��";
		}
		// ת�����
		String result = getIntger(strNum) + point + getDecimal(strNum);
		if (result.startsWith("Ԫ")) {// �ж��ַ����Ƿ���ԪΪ��ʼ-��С��һԪ
			result = result.substring(1, result.length());// ��ȡ�ַ���
		}
		return result;
	}

	// 2.ת����������
	private static String getIntger(String num) {
		if (num.indexOf(".") != -1) {
			num = num.substring(0, num.indexOf("."));
		}
		num = new StringBuilder(num).reverse().toString();// ��ת�ַ���
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < num.length(); i++) {
			temp.append(STR_UNIT[i]);
			temp.append(STR_NUMBER[num.charAt(i) - 48]);// num.charAt(i)-48��ȡ��ֵ
			// ����ʹ��Integer.pa����
		}
		num = temp.reverse().toString();// ��ת�ַ���
		while (true) {
			// �滻�ַ���
			num = num.replaceAll("��ʰ", "��");// �滻�ַ������ַ�
			num = num.replaceAll("���", "��");
			num = num.replaceAll("��Ǫ", "��");
			num = num.replaceAll("����", "��");
			num = num.replaceAll("����", "��");
			num = num.replaceAll("����", "��");
			num = num.replaceAll("����", "��");
			// �ж��ַ������Ƿ����ָ���ַ�
			if (num.indexOf("����") == -1) {
				break;
			}
		}
		if (num.lastIndexOf("��") == num.length() - 1) {// ����ַ��������β�����ȥ
			num = num.substring(0, num.length() - 1);
		}
		return num;
	}

	// 3.ת��С������
	private static String getDecimal(String num) {
		// �ж��Ƿ����С����
		if (num.indexOf(".") == -1) {
			return "";
		}
		num = num.substring(num.indexOf(".") + 1);
		// ��ת�ַ���
		// num = new StringBuffer(num).reverse().toString();
		num = new StringBuffer(num).toString();
		StringBuffer temp = new StringBuffer();
		// ���뵥λ
		for (int i = 0; i < num.length(); i++) {
			temp.append(STR_NUMBER[num.charAt(i) - 48]);
			temp.append(STR_UNIT2[i]);
		}
		num = temp.toString();
		while (true) {
			// �滻�ַ���
			num = num.replaceAll("���", "��"); // �滻�ַ������ַ�
			num = num.replaceAll("���", "��"); // �滻�ַ������ַ�
			num = num.replaceAll("����", "��"); // �滻�ַ������ַ�
			num = num.replaceAll("����", "��"); // �滻�ַ������ַ�
			// �ж��ַ������Ƿ����ָ���ַ�
			if (num.indexOf("����") == -1) {
				break;
			}
		}
		// ����ַ��������β�����ȥ
		if (num.lastIndexOf("��") == num.length() - 1) {
			num = num.substring(0, num.length() - 1);
		}
		return num;
	}

	@SuppressWarnings("resource")
	public static double getScanner() {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����");
		return in.nextDouble();
	}
}
