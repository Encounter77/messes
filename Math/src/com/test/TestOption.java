package com.test;

import java.util.Scanner;

public class TestOption {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������Ҫ���׵Ķ��������");
		int n = scanner.nextInt();
		System.out.print("������������ż���߱�׼(1-10)��");
		double d = scanner.nextDouble();
		// �ⶨ����ż���ֲ���ֵr
		double r = 0.02;
		Option[] option = new Option[n];
		double max = 0;
		int i = 0;
		for (; i < option.length; i++) {
			System.out.println("���ڣ����������" + (i + 1) + "��Ŀ�������������ֵȼ�");
			String appearanceScore = scanner.next();
			String hobbyScore = scanner.next();
			String characterScore = scanner.next();
			option[i] = new Option();
			option[i].appearanceScore = appearanceScore;
			option[i].hobbyScore = hobbyScore;
			option[i].characterScore = characterScore;
			double resultScore = option[i].resultScore();
			if (resultScore >= max) {
				max = resultScore;
			}
			if (option[i].bestOption(resultScore, d, r)) {
				System.out.println("����������ż��׼���ó��������ַ�Χ��(" + (d - r) + "~"
						+ (d + r) + ")");
				System.out.println("��ϲ�����������ѡ���Ѿ����֣���" + (i + 1) + "�����������֣�"
						+ resultScore*10);
				break;
			}
		}
		if (i >= option.length) {
			System.out.println("����������ż��׼���ó��������ַ�Χ��(" + (d - r) + "~" + (d + r)
					+ ")");
			System.out.println("���������У���ż������߷�Ϊ��" + max*10);
			System.out.println("���ź����ڸ���������û�в��ҵ���������׼����ż����");
		}
		scanner.close();
	}
}
