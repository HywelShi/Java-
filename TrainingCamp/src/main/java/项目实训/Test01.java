package 项目实训;

import java.util.Scanner;

/**
 * 用户输入年份，循环判断输入的年份是否为闰年
 * 输入exit退出
 * 闰年判断条件：能被4整除但不能被100整除，或者能被400整除的年份
 * 
 * @author hywel
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("请输入年份：");
			String input = scan.next();
			if("exit".equals(input)) {
				scan.close();
				System.out.println("已退出！");
				break;
			}else {
				int year = Integer.parseInt(input);
				if((year%400==0)||(year%4==0&&year%100!=0)) {
					System.out.println("此年份是闰年！");
				}else {
					System.out.println("此年份不是闰年！");
				}
			}
			
		}
		
		

	}

}
