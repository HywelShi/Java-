package 项目实训;

import java.util.Scanner;

/**
 * 分别输入年份 月份和日期
 * 输出是本年的第几天
 * @author hywel
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		System.out.println("请输入日期：");
		int date = scan.nextInt();
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int count = 0;//计算天数
		if(month<=1) {
			count = date;
		}else {
			for (int i = 0; i < month-1; i++) {
				count += days[i];
			}
			count += date;
			if((year%400==0)||(year%4==0&&year%100!=0)) {
				count++;
			}
		}
		System.out.println("第"+count+"天！");
		scan.close();
		
		
	}
}
