package com.test;

import java.util.Scanner;

public class TestOption {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您要相亲的对象个数：");
		int n = scanner.nextInt();
		System.out.print("请输入您的择偶决策标准(1-10)：");
		double d = scanner.nextDouble();
		// 拟定的择偶评分波动值r
		double r = 0.02;
		Option[] option = new Option[n];
		double max = 0;
		int i = 0;
		for (; i < option.length; i++) {
			System.out.println("现在，请您输入第" + (i + 1) + "个目标对象的三类评分等级");
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
				System.out.println("根据您的择偶标准，得出以下评分范围：(" + (d - r) + "~"
						+ (d + r) + ")");
				System.out.println("恭喜您，您的最佳选择已经出现：第" + (i + 1) + "个对象，总评分："
						+ resultScore*10);
				break;
			}
		}
		if (i >= option.length) {
			System.out.println("根据您的择偶标准，得出以下评分范围：(" + (d - r) + "~" + (d + r)
					+ ")");
			System.out.println("本组数据中，择偶对象最高分为：" + max*10);
			System.out.println("很遗憾，在该组数据中没有查找到符合您标准的择偶对象。");
		}
		scanner.close();
	}
}
