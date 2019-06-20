package java基础.day01;

public class Random {

	public static void main(String[] args) {
		// 随机数公式
		// 生成a-b之间的随机整数 要求a与b为整数且a<b
		// (int)(Math.random()*(b-a+1)+a)
		// 生成1-100之间的随机整数
		int num = (int)(Math.random()*100+1);
		System.out.println(num);

	}

}
